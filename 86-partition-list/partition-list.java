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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;

        ListNode s = null;
        ListNode h = null;
        ListNode hHead = null;

        ListNode prevs = null;
        ListNode prevh = null;

        while(temp != null){
            if(temp.val < x){
                if(s == null){
                    s = temp;
                    prevs = temp;
                    temp = temp.next;
                    continue;
                }
                prevs.next = temp;
                prevs = temp;
            }
            else{
                if(h == null){
                    h = temp;
                    prevh = temp;
                    temp = temp.next;
                    continue;
                }
                prevh.next = temp;
                prevh = temp;
            }

            temp = temp.next;
        }

        if(h != null) prevh.next = null;

        if(s != null){
            prevs.next = h;
        }
        else{
            s = h;
        }

        return s;
    }
}