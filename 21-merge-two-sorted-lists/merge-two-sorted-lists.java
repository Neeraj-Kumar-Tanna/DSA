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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(Integer.MIN_VALUE);
        ListNode head = res;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                res.next = list1;
                ListNode nx = list1.next;
                list1.next = null;
                list1 = nx;
            }
            else{
                res.next = list2;
                ListNode nx = list2.next;
                list2.next = null;
                list2 = nx;
            }
            res = res.next;
        }
        if(list2 != null){
            res.next = list2;
        }
        else{
            res.next = list1;
        }

        return head.next;
    }
}