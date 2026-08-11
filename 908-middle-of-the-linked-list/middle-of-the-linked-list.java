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
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int x = (len)/2 + 1;
        temp = head;
        int i = 1;
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

        while(i < x){
            temp = temp.next;
            i++;
        }

        return temp;
    }
}