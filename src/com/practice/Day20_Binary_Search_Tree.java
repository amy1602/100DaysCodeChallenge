package com.practice;

public class Day20_Binary_Search_Tree {
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) return root;
        for (int i = 1; i < preorder.length; i++) {
            walk(root, preorder[i]);
        }
        return root;
    }

    public static void walk(TreeNode currNode, int value) {
        if (currNode.val > value) {
            if (currNode.left == null) {
                currNode.left = new TreeNode(value);
            } else {
                walk(currNode.left, value);
            }
        } else {
            if (currNode.right == null) {
                currNode.right = new TreeNode(value);
            } else {
                walk(currNode.right, value);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
