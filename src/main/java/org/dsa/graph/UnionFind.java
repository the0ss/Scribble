package org.dsa.graph;

public class UnionFind {
  int[] parent;
  int[] rank;

  public UnionFind(int size) {
    this.parent = new int[size];
    this.rank = new int[size];

    for (int i = 0; i < size; i++) {
      parent[i] = i;
      rank[i] = 0;
    }
  }

  public int findParent(int node) {
    if (parent[node] != node) {
      parent[node] = findParent(parent[node]); // Path compression
    }
    return parent[node];
  }

  public void union(int u, int v) {
    int rootU = findParent(u);
    int rootV = findParent(v);

    if (rootV == rootU) {
      return;
    }
    if (rank[rootV] < rank[rootU]) {
      parent[rootV] = rootU;
    } else if (rank[rootU] < rank[rootV]) {
      parent[rootU] = rootV;
    } else {
      parent[rootU] = rootV;
      rank[rootU]++;
    }
  }

  public boolean connected(int u, int v) {
    return findParent(u) == findParent(v);
  }
}
