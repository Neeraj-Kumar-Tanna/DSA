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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }

        ListNode temp = head;
        ListNode od = head;
        ListNode ev = head.next;
        ListNode evhead = head.next;

        int count = 1;
        temp = head.next.next;

        while(temp != null){
            if(count%2 == 1){
                od.next = temp;
                od = temp;
            }
            else{
                ev.next = temp;
                ev = temp;
            }
            temp = temp.next;
            count++;
        }

        ev.next = null;
        od.next = evhead;

        return head;
    }
}