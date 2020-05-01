package com.practice;

public class Day29_Binary_Tree_Maximun_Path_Sum {
    public static void main(String[] args) {
        // write your code here
        Main.TreeNode node9 = new Main.TreeNode(-6);
        Main.TreeNode node8 = new Main.TreeNode(-6);
        node8.left = node9;
        Main.TreeNode node7 = new Main.TreeNode(-6);
        Main.TreeNode node6 = new Main.TreeNode(2);
        node6.left = node8;
        node6.right = node7;
        Main.TreeNode node5 = new Main.TreeNode(2);
        node5.left = node6;
        Main.TreeNode node4 = new Main.TreeNode(-6);
        Main.TreeNode node3 = new Main.TreeNode(-3);
        node3.left = node4;
        node3.right = node5;
        Main.TreeNode node2 = new Main.TreeNode(6);
        Main.TreeNode node1 = new Main.TreeNode(9);
        node1.left = node2;
        node1.right = node3;


        System.out.println(maxPathSum(node1));
    }

    static int maxSum = Integer.MIN_VALUE;
    public static int maxPathSum(Main.TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        travelNode(root);
        return maxSum;
    }

    public static int travelNode(Main.TreeNode node) {
        if (node == null) return 0;
        int maxLeft = travelNode(node.left);
        int maxRight = travelNode(node.right);
        int maxCurrent = Math.max(Math.max(node.val + maxLeft + maxRight, node.val + maxLeft), Math.max(node.val + maxRight, node.val));
        maxSum = Math.max(maxCurrent, maxSum);
        return Math.max(node.val + Math.max(maxLeft, maxRight), node.val);
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
