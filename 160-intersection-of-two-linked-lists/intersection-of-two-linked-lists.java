/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> a = new HashSet<>();

        ListNode tempa = headA;
        while(tempa != null){
            a.add(tempa);
            tempa = tempa.next;
        }

        tempa = headB;
        while(tempa != null){
            if(a.contains(tempa)){
                return tempa;
            }
            tempa = tempa.next;
        }

        return null;
    }

}