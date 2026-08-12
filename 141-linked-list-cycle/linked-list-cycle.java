/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean isLoop = false;
        ListNode temp = head;
        int count = 0 ;
        while(temp != null){
            count++;
            if(count > 10000) return true;

            temp = temp.next;
        }

        return false;
    }
}