package org.dsa.graph;

import java.util.*;

public class BFS {
  public static void main(String[] args) {
    int[][] vertices = {{0, 1}, {1, 2}, {0, 3}, {1, 4}};
    bfs(vertices, 5);
  }

  public static void bfs(int[][] vertices, int totalVertices) {
    List<Integer>[] graph = new List[totalVertices];

    for (int[] vertex : vertices) {
      if (Objects.isNull(graph[vertex[0]])) {
        graph[vertex[0]] = new ArrayList<>();
      }
      if (Objects.isNull(graph[vertex[1]])) {
        graph[vertex[1]] = new ArrayList<>();
      }
      graph[vertex[0]].add(vertex[1]);
      graph[vertex[1]].add(vertex[0]);
    }

    int[] visited = new int[totalVertices];

    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    while (!queue.isEmpty()) {
      Integer currentNode = queue.poll();
      System.out.print(currentNode + " ");
      visited[currentNode] = 1;
      if (Objects.nonNull(graph[currentNode])) {
        for (Integer nextNode : graph[currentNode]) {
          if (visited[nextNode] == 0) {
            queue.add(nextNode);
          }
        }
      }
    }
  }
}
