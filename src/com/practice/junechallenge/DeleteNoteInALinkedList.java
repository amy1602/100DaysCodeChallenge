package com.practice.junechallenge;

public class DeleteNoteInALinkedList {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        ListNode currNode = node;
        while (nextNode.next != null) {
            currNode.val = nextNode.val;
            currNode = nextNode;
            nextNode = currNode.next;
        }
        currNode.val = nextNode.val;
        currNode.next = null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
