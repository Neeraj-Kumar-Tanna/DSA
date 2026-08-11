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
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp2 != null && temp2.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        // int x = (len)/2 + 1;
        // temp = head;
        // int i = 1;
        // if(len%2 == 0){
        //     while(i <= x){
        //         temp = temp.next;
        //         i++;
        //     }
        // }
        // else{
        //     while(i < x){
        //         temp = temp.next;
        //         i++;
        //     }
        // }

        // while(i < x){
        //     temp = temp.next;
        //     i++;
        // }

        return temp1;
    }
}