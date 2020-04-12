package com.practice;

public class Day11_Diameter_Of_Binary_Tree {
    static int maxLength = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxLength = 0;
        int maxLengthAtRoot = findMaxLeft(root) + findMaxRight(root);
        return Math.max(maxLength, maxLengthAtRoot);
    }
    public static int findMaxLeft(TreeNode currNode) {
        if (currNode == null || currNode.left == null) {
            return 0;
        } else {
            int maxLengthLeft = findMaxLeft(currNode.left);
            int maxLengthRight = findMaxRight(currNode.left);
            maxLength = Math.max(maxLength, maxLengthLeft + maxLengthRight);
            return 1 + Math.max(maxLengthLeft, maxLengthRight);
        }
    }

    public static int findMaxRight(TreeNode currNode) {
        if (currNode == null || currNode.right == null) {
            return 0;
        } else {
            int maxLengthLeft = findMaxLeft(currNode.right);
            int maxLengthRight = findMaxRight(currNode.right);
            maxLength = Math.max(maxLength, maxLengthLeft + maxLengthRight);
            return 1 + Math.max(maxLengthLeft, maxLengthRight);
        }
    }
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
