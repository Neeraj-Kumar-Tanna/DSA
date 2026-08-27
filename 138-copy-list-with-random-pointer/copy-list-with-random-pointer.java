/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node temp = head;
        Node res = null;
        HashMap<Node , Node > mp = new HashMap<>();
        while(temp != null){
            Node nn = new Node(temp.val);
            if(res == null){
                res = nn;
            }
            mp.put(temp , nn);
            temp = temp.next;
        }

        temp = head;
        while(temp.next != null){
            Node cur = mp.get(temp);
            cur.next = mp.get(temp.next);
            if(temp.random != null){
                cur.random = mp.get(temp.random);
            }
            else{
                cur.random = null;
            }
            temp = temp.next;
        }
        mp.get(temp).next =null;
        mp.get(temp).random = mp.get(temp.random);
        

        return res;
    }

    public static int indRand(Node head,Node req){
        int cnt = 0;
        while(head != null){
            if(head == req) break;
            cnt++;

            head = head.next;
        }
        return cnt;
    }
}