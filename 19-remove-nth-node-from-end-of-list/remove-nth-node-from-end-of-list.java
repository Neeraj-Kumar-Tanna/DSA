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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        int nodes = 0;
        while(temp != null){
            nodes++;
            temp = temp.next;
        }

        if(nodes-n == 0){
            head = head.next;
            return head;
        }
        
        int count = 1;
        temp = head;
        while(count < nodes-n){
            count++;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}