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

 ***********
 ******************************************************/
import java.util.*;

//import com.sun.javadoc.SeeTag;
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
       Node a= firstHead;
       Node b = secondHead; 
       while(a!=b){
           if(a==null){
               a= secondHead;
           }
           else{
               a = a.next;
           }
           if(b==null){
               b = firstHead;
           }
           else{
               b = b.next;
           }
       }
       return a==null ? -1 : a.data;
    }
}