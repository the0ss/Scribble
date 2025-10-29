package org.dsa.trees;

import org.dsa.trees.models.TreeNode;

import java.util.Objects;
import java.util.PriorityQueue;

public class LCA_BinaryTree {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(6);
    root.setLeft(new TreeNode(2));
    root.setRight(new TreeNode(8));
    TreeNode lca = lowestCommonAncestor(root, 2, 8);
    if (Objects.nonNull(lca)) {
      System.out.println("LCA: " + lca.getValue());
    }
  }

  public static TreeNode lowestCommonAncestor(TreeNode rootNode, int a, int b) {
    if (rootNode.getValue() == a || rootNode.getValue() == b || rootNode == null) {
      return rootNode;
    }
    TreeNode left = lowestCommonAncestor(rootNode.getLeft(), a, b);
    TreeNode right = lowestCommonAncestor(rootNode.getRight(), a, b);
    if (left == null && right == null) {
      return null;
    } else if (left != null && right != null) {
      return rootNode;
    }
    return left == null ? right : left;
  }
}
