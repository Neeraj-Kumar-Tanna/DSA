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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = len(head);
        k = k%len;
        ListNode res = head;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;

        temp = head;
        for(int i = 1; i < len-k ;i++){
            temp = temp.next;
            // System.out.println(temp.val);
        }
        res = temp.next;
        temp.next = null;

        return res; 
    }

    public static int len(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}