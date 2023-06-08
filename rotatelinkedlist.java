/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        if(head == null || head.next ==null || k==0){
            return head;
        }
        // Write your code here.
        int count = 1;
        Node ptr = head;
        while(ptr.next!=null){
            count++;
            ptr = ptr.next;
        }
        ptr.next = head;
        k = k %count;
        k = count -k;

        for(int i=0; i<k; i++){
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        return head;
    }
}