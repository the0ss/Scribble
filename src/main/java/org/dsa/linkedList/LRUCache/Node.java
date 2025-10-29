package org.dsa.linkedList.LRUCache;

public class Node {
  int key, value;
  Node prev, next;

  public Node(int key, int value) {
    this.key = key;
    this.value = value;
  }
}
