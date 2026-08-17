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
    public ListNode sortList(ListNode head) {

        ListNode res = merge1(head);
        return res;

        //-------------------BRUTE FORCE-------------------

        // List<Integer> li = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     li.add(temp.val);
        //     temp = temp.next;
        // }

        // Collections.sort(li);

        // temp= head;
        // int i = 0 ;
        // while(temp != null){
        //     temp.val = li.get(i);
        //     i++;
        //     temp = temp.next;
        // }

        // return head;
    }

    public static ListNode merge1(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode mid = findMid(temp);
        ListNode nx = mid.next;
        mid.next = null;
        // System.out.println("l : "+temp.val + "r : " + nx.val);
        ListNode left = merge1(temp);
        ListNode right = merge1(nx);
        ListNode res = merge2(left , right);
        return res;
    }

    public static ListNode merge2(ListNode l , ListNode r){
        ListNode temp = new ListNode(Integer.MIN_VALUE);
        ListNode tail = temp;
        while(l != null && r != null){
            if(l.val < r.val){
                tail.next = l;
                l= l.next;
            }
            else{
                tail.next = r;
                r = r.next;
            }

            tail = tail.next;
        }

        if(l != null){
            tail.next = l;
        }
        else{
            tail.next =r;
        }

        return temp.next;
    }

    public static ListNode merge3(ListNode l , ListNode r){

        ListNode head = null;
        ListNode prevR = null;
        ListNode prevL = null;

        while(l != null && r != null){
            int lval = l.val;
            int rval = r.val;

            if(lval < rval){
                if(head == null) head = l;
                ListNode nx = l.next;
                prevL = l;
                l.next = r;
                l = nx;
            }
            else{
                if(head == null) head = r;
                ListNode nx = r.next;
                prevR = r;
                r.next = l;
                r = nx;
            }
        }
        if(l != null){
            prevR.next = l;
        }
        else if(r != null){
            prevL.next = r;
        }

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp  = temp.next;
        }
        System.out.println();
        return head;
    }

    public static ListNode findMid(ListNode head){
        ListNode temp = head;
        if(temp == null || temp.next == null){
            return head;
        }

        ListNode fast = temp;
        ListNode slow = temp;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}