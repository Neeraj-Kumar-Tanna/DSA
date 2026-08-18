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
        Set<ListNode> b = new HashSet<>();

        while(headA != null || headB != null){
            if(headA != null){
                if(b.contains(headA)){
                    return headA;
                }
                else{
                    a.add(headA);
                    headA = headA.next;
                }
            }
            if(headB != null){
                if(a.contains(headB)){
                    return headB;
                }
                else{
                    b.add(headB);
                    headB = headB.next;
                }
            }
        }

        return null;

        //------------APPROACH-1-----------------
        // Set<ListNode> a = new HashSet<>();

        // ListNode tempa = headA;
        // while(tempa != null){
        //     a.add(tempa);
        //     tempa = tempa.next;
        // }

        // tempa = headB;
        // while(tempa != null){
        //     if(a.contains(tempa)){
        //         return tempa;
        //     }
        //     tempa = tempa.next;
        // }

        // return null;
    }

}