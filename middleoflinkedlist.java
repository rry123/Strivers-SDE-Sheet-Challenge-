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
 }

 *****************************************************************/

public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow = head;
        Node fast = head;
        if(head == null || head.next==null){
            return head;
        }
        Node ptr = head;
        int size=0;
        while(ptr!=null){
            ptr = ptr.next;
            size++;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(size%2==0){
            return slow.next;
        }
        return slow;
    }
}