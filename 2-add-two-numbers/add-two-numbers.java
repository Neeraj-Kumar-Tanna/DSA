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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;

        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while(one!= null && two != null){
            int val = one.val + two.val + carry;
            ListNode temp = new ListNode(val%10);
            prev.next = temp;
            prev = prev.next;
            one = one.next;
            two = two.next;
            carry = val/10;
        }
        while(one != null){
            int val = one.val + carry;
            ListNode temp = new ListNode(val%10);
            prev.next = temp;
            prev = prev.next;
            one = one.next;
            carry = val/10;
        }
        while(two != null){
            int val = two.val + carry;
            ListNode temp = new ListNode(val%10);
            prev.next = temp;
            prev = prev.next;
            two = two.next;
            carry = val/10;
        }
        while(carry > 0){
            ListNode temp = new ListNode(carry%10);
            prev.next = temp;
            prev = prev.next;
            carry = carry/10;
        }

        return head.next;
    }

    public static ListNode rev(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
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