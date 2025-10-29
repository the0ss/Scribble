package org.dsa.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
  public static void main(String[] args) {}

  public int[] dijkstra(int V, int[][] edges, int src) {

    List<int[]>[] adj = new List[V];
    int[] distance = new int[V];
    Arrays.fill(distance, Integer.MAX_VALUE);

    for (int[] edge : edges) {
      if (adj[edge[0]] == null) {
        adj[edge[0]] = new ArrayList<>();
      }
      if (adj[edge[1]] == null) {
        adj[edge[1]] = new ArrayList<>();
      }
      adj[edge[0]].add(new int[] {edge[1], edge[2]});
      adj[edge[1]].add(new int[] {edge[0], edge[2]});
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    pq.add(new int[] {src, 0});
    distance[src] = 0;

    while (!pq.isEmpty()) {
      int[] currentNode = pq.poll();

      if (adj[currentNode[0]] != null) {
        for (int[] nextNode : adj[currentNode[0]]) {
          int totalDistance = currentNode[1] + nextNode[1];

          if (totalDistance < distance[nextNode[0]]) {
            distance[nextNode[0]] = totalDistance;
            pq.add(new int[] {nextNode[0], totalDistance});
          }
        }
      }
    }
    return distance;
  }
}
