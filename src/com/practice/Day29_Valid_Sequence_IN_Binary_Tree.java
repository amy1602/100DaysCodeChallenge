package com.practice;

public class Day29_Valid_Sequence_IN_Binary_Tree {
    public static boolean isValidSequence(Main.TreeNode root, int[] arr) {
        return travelNode(root, arr, 0);
    }

    public static boolean travelNode(Main.TreeNode node, int[] arr, int index) {
        if (node == null || node.val != arr[index]) return false;
        if (index < arr.length - 1) {
            index ++;
            return travelNode(node.left, arr, index) || travelNode(node.right, arr, index);
        }
        return node.left == null && node.right == null && index == arr.length - 1;
    }

    public static class TreeNode {
        int val;
        Main.TreeNode left;
        Main.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Main.TreeNode left, Main.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
