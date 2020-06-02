package com.practice.junechallenge;

import com.practice.Main;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        invertNode(root);
        return root;
    }
    public static void invertNode(TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                invertNode(node.left);
            }
            if (node.right != null) {
                invertNode(node.right);
            }
            TreeNode leftNode = node.left;
            node.left = node.right;
            node.right = leftNode;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
