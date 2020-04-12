package com.practice;

public class Day10_Min_Stack {
    Node head;

    public class Node {
        int value;
        Node nextNode;
        Node currentMinNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            newNode.nextNode = null;
        } else {
            newNode.nextNode = head;
            newNode.currentMinNode = head.currentMinNode;
        }
        head = newNode;
        if (head.currentMinNode == null || head.currentMinNode.value > x) {
            head.currentMinNode = newNode;
        }
    }

    public void pop() {
        if (head == null) return;
        head = head.nextNode;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.currentMinNode.value;
    }
}
