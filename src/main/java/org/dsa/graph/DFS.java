package org.dsa.graph;

import java.util.*;

public class DFS {
  public static void main(String[] args) {
    int[][] vertices = {{0, 1}, {1, 2}, {0, 3}, {2, 4}};
    dfs(vertices, 5);
  }

  public static void dfs(int[][] vertices, int totalVertices) {
    List<Integer>[] adj = new List[totalVertices];
    int[] visited = new int[totalVertices];
    Stack<Integer> stack = new Stack<>();

    for (int[] edge : vertices) {
      if (Objects.isNull(adj[edge[0]])) {
        adj[edge[0]] = new ArrayList<>();
      }
      if (Objects.isNull(adj[edge[1]])) {
        adj[edge[1]] = new ArrayList<>();
      }
      adj[edge[0]].add(edge[1]);
      adj[edge[1]].add(edge[0]);
    }

    stack.add(0);

    while (!stack.empty()) {
      Integer currentNode = stack.pop();
      if (visited[currentNode] == 0) {
        visited[currentNode] = 1;
        System.out.print(currentNode + " ");
        for (int nextNode : adj[currentNode]) {
          if (visited[nextNode] == 0) {
            stack.add(nextNode);
          }
        }
      }
    }

    Map<Integer, Integer> m = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Set<Integer> s = new HashSet<>();
    Queue<Integer> q = new LinkedList<>();
    Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());
  }
}
