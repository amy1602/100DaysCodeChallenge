package com.practice.MayChallenge;

public class OddEvenLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode node = head;
        ListNode nextNode = head.next;
        ListNode fistEvenNode = nextNode;
        while (nextNode != null) {
            ListNode nextNextNode = nextNode.next;
            node.next = nextNextNode;
            if (nextNextNode != null) {
                nextNode.next = nextNextNode.next;
                node = nextNextNode;
                nextNode = nextNextNode.next;
                if (nextNode == null) {
                    node.next = fistEvenNode;
                }
            } else {
                node.next = fistEvenNode;
                nextNode = null;
            }
        }
        return head;
    }
}
