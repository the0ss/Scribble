package org.dsa.linkedList.LRUCache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LRUCache {
  int capacity;
  int size;
  Node head, tail;
  Map<Integer, Node> cache = new HashMap<>();

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.head = new Node(0, 0);
    this.tail = new Node(0, 0);
    head.next = tail;
    tail.prev = head;
  }

  private void addToHead(Node node) {
    node.prev = head;
    node.next = head.next;
    head.next.prev = node;
    head.next = node;
  }

  private void removeNode(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  private void moveNode(Node node) {
    removeNode(node);
    addToHead(node);
  }

  private Node removeFromTail() {
    Node lastElement = tail.prev;
    removeNode(lastElement);
    return lastElement;
  }

  public int get(int key) {
    Node node = cache.get(key);
    if (Objects.isNull(node)) {
      return -1;
    }
    moveNode(node);
    return node.value;
  }

  public void put(int key, int value) {
    Node node = cache.get(key);
    if (Objects.nonNull(node)) {
      moveNode(node);
      return;
    }

    Node newNode = new Node(key, value);
    cache.put(key, newNode);
    addToHead(newNode);
    size++;

    // if the size limit reached

    if (size > capacity) {
      Node tail = removeFromTail();
      cache.remove(tail.key);
      size--;
    }
  }
}
