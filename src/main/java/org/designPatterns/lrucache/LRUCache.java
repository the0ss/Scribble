package org.designPatterns.lrucache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LRUCache {

  private Node start;
  private Node end;
  private Integer size, capacity;

  private Map<Integer, Node> cache = new HashMap<>();

  public LRUCache(Integer capacity) {
    this.size = 0;
    this.capacity = capacity;
    this.start = new Node(null, null);
    this.end = new Node(null, null);
  }

  public void addNode(Node node) {
    node.setPrev(start);
    node.setNext(start.getNext());
    start.getNext().setPrev(node);
    start.setNext(node);
  }

  private void removeNode(Node node) {
    node.getPrev().setNext(node.getNext());
    node.getNext().setPrev(node.getPrev());
  }

  private void moveToFront(Node node) {
    removeNode(node);
    addNode(node);
  }

  public int getNode(int key) {
    Node node = cache.get(key);
    if (Objects.isNull(node)) {
      return -1;
    }
    moveToFront(node);
    return node.getValue();
  }

  private Node removeFromTail() {
    Node last = end.getPrev();
    removeNode(last);
    return last;
  }

  public void put(int key, int value) {
    Node node = cache.get(key);
    if (Objects.nonNull(node)) {
      node.setValue(value);
      moveToFront(node);
      return;
    }
    Node newNode = new Node(key, value);
    cache.put(key, newNode);
    addNode(newNode);
    size++;
    if (size > capacity) {
      Node last = removeFromTail();
      size--;
      cache.remove(last.getKey());
    }
  }
}
