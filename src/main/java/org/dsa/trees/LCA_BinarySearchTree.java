package org.dsa.trees;

import org.dsa.trees.models.TreeNode;

import java.util.Objects;

public class LCA_BinarySearchTree {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(6);
    root.setLeft(new TreeNode(2));
    root.setRight(new TreeNode(8));
    TreeNode lca = lowestCommonAncestor(root, 2, 8);
    if (Objects.nonNull(lca)) {
      System.out.println(lca.getValue());
    }
  }

  public static TreeNode lowestCommonAncestor(TreeNode root, int a, int b) {
    int small = Math.min(a, b);
    int large = Math.max(a, b);

    while (Objects.nonNull(root)) {
      if (root.getValue() > large) {
        root = root.getLeft();
      } else if (root.getValue() < small) {
        root = root.getRight();
      } else {
        return root;
      }
    }
    return null;
  }
}
