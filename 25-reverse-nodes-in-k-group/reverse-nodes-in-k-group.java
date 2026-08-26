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
    public static ListNode temp = null;
    // public static ListNode res = null;

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next ==null || k == 1){
            return head;
        }
        int len = len(head);
        int x = 0;
        temp = head;
        ListNode dup = head;
        ListNode init = null;
        ListNode res = null;
        boolean found = false;
        while(x < len/k){
            x++;
            for(int i = 0 ; i < k; i++){
                if(i == k-1 && !found){
                    res = dup;
                    found = true;
                }
                dup = dup.next;
            }
            init = rev(temp , init , k);
            temp = dup;
        }
        if(temp != null){
            init.next = temp;
        }
        return res;
    }

    public static ListNode rev(ListNode temp , ListNode init , int k){
        int cnt = 0;
        ListNode prev = null;
        ListNode st = temp;

        while(cnt < k && temp != null){
            ListNode nx = temp.next;
            System.out.println(cnt + "node : " + temp.val);
            temp.next = prev;
            prev = temp;
            temp = nx;
            cnt++;
        }
        if(init != null){
            init.next = prev;
        }
        return st;
    }

    public static int len(ListNode head){
        ListNode temp = head;
        int cnt= 0 ;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}