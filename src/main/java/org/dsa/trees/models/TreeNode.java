package org.dsa.trees.models;

public class TreeNode {
  int value;
  TreeNode left, right;

  public TreeNode(int value) {
    this.value = value;
    left = right = null;
  }

  public int getValue() {
    return value;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  public TreeNode getLeft() {
    return left;
  }

  public TreeNode getRight() {
    return right;
  }
}
