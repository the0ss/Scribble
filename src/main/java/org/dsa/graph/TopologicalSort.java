package org.dsa.graph;

import java.util.*;

public class TopologicalSort {
  public static void main(String[] args) {
    int[][] prerequisites = new int[][] {{1, 0}, {0, 1}};
    System.out.println(canFinish(2, prerequisites));
  }

  private static boolean canFinish(int numCourses, int[][] prerequisites) {
    List<Integer>[] adj = new List[numCourses];
    int[] inorder = new int[numCourses];

    for (int[] edge : prerequisites) {
      if (Objects.isNull(adj[edge[1]])) {
        adj[edge[1]] = new ArrayList<>();
      }
      adj[edge[1]].add(edge[0]);
      inorder[edge[0]]++;
    }

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < numCourses; i++) {
      if (inorder[i] == 0) {
        queue.add(i);
      }
    }
    int cnt = 0;
    while (!queue.isEmpty()) {
      Integer currentNode = queue.poll();
      cnt++;
      if (Objects.nonNull(adj[currentNode])) {
        for (Integer nextNode : adj[currentNode]) {
          if (--inorder[nextNode] == 0) {
            queue.add(nextNode);
          }
        }
      }
    }
    return numCourses == cnt;
  }
}
