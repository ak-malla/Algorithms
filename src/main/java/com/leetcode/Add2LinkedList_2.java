package com.leetcode;

/**
 * Created by AK on 11/06/17.
 */
public class Add2LinkedList_2 {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */
    static class ListNode {

        int value;
        ListNode next;

        //Constructor
        public ListNode(int value) {
            this.value = value;
            next = null;
        }

    }

    public static void main(String[] a) {
        ListNode l = new ListNode(7);
        ListNode l1 = l; // Reference
        l1.next = new ListNode(7);
        l1 = l1.next;
        l1.next = new ListNode(7);

        ListNode ll = new ListNode(7);
        ListNode l2 = ll; // Reference
        l2.next = new ListNode(7);
        l2 = l2.next;
        l2.next = new ListNode(7);

        System.out.println("The So entered ListNodes ");
        printListNode(l);
        printListNode(ll);

        printListNode(sumNodes(l, ll));
    }

    private static ListNode sumNodes(ListNode l, ListNode ll) {
        ListNode l1 = l;
        ListNode l2 = ll;

        ListNode sentinel = new ListNode(0);
        ListNode s = sentinel;

        int sum = 0;
        while (l1 != null || l2 != null) {
            sum = sum / 10;

            if (l1 != null) {
                sum = sum + l1.value;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.value;
                l2 = l2.next;
            }

            s.next = new ListNode(sum % 10);
            s = s.next;
        }

        if (sum / 10 > 0)
            s.next = new ListNode(sum / 10);

        return sentinel.next;
    }

    private static void printListNode(ListNode n) {
        while (n != null) {
            System.out.print(n.value);
            System.out.print(" ");
            n = n.next;
        }
        System.out.println();
    }
}
