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
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null){
            // System.out.println(fast.next);
            // System.out.println(fast.next);
            if(fast.next == null){
                break;
            }

            fast = fast.next.next;
            ListNode nx = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nx;

            // System.out.println(slow + " , " + fast + " , ");
            // System.out.println(fast.next);
        }
        
        if(fast == null){
            while(slow != null && prev != null){
                if(slow.val != prev.val) return false;

                slow = slow.next;
                prev = prev.next;
            }
        }
        else{
            slow = slow.next;
            while(slow != null && prev!= null){
                if(slow.val != prev.val) return false;

                slow = slow.next;
                prev = prev.next;
            }
        }

        return true;
    }
}