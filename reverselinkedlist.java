import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head==null || head.next==null){
			return head;
		}
		LinkedListNode<Integer> prev = head;
		LinkedListNode<Integer> curr = head.next;
		while(curr!=null){
			LinkedListNode<Integer> next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head.next = null;
		return prev;
    }
}