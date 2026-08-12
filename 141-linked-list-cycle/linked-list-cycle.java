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
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp2 != null){
            if(temp2.next == null) return false;
            
            temp1 = temp1.next;
            temp2 = temp2.next.next;

            if(temp1 == temp2) return true;

        }

        return false;


        // int count = 0 ;
        // while(temp != null){
        //     count++;
        //     if(count > 10000) return true;
        //     temp = temp.next;
        // }

        // return false;
    }
}