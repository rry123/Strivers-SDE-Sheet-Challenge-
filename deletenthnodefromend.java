/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(head == null || head.next==null){
            return null;
        }
       Node ptr = head;
       int count =0;
       while(ptr!=null){
           ptr = ptr.next;
           count++;
       }
      // System.out.println(count);
       ptr = head;
       if(count-K==0){
           head= head.next;
           return head;
       }
       for(int i=0; i<count-K-1; i++){
           ptr = ptr.next;
       }

       ptr.next = ptr.next.next;
      
      
       return head;
    }
}