/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;

        head = rev(head);

        ListNode p1 = head;
        ListNode p2 = head.next;

        ListNode res = head;
        boolean ch = false;

        while(p2 != null){
            if(p2.val >= p1.val){
                p1.next = p2;
                p1 = p1.next;
            }
            p2 = p2.next;
        }
        p1.next = p2;

        return rev(res);
    }

    private static ListNode rev(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode nx = head.next;
            head.next = prev;
            prev = head;
            head = nx;
        }

        return prev;
    }
}