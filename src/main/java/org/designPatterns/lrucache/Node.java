package org.designPatterns.lrucache;

public class Node {
  private Integer value, key;
  private Node prev, next;

  public Node(Integer key, Integer value) {
    this.value = value;
    this.key = key;
  }

  public Integer getValue() {
    return value;
  }

  public Integer getKey() {
    return key;
  }

  public Node getPrev() {
    return prev;
  }

  public Node getNext() {
    return next;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
