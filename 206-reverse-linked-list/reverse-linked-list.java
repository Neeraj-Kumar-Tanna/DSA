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
    public ListNode reverseList(ListNode head) {
        ListNode sol = rev(head , null);
        return sol;
    }

    public static ListNode rev(ListNode temp , ListNode prev){
        if(temp == null){
            return null;
        }
        if(temp.next == null){
            temp.next = prev;
            return temp;
        }

        ListNode nx = temp.next;
        temp.next = prev;

        return rev(nx , temp);
    }
}