package com.practice;

public class Day8_Middle_Of_The_Linked_List {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;
        ListNode middle = head;
        while (current.next != null) {
            length ++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next;
        }
        if (length % 2 == 1) {
            middle = middle.next;
        }
        return middle;
    }
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
