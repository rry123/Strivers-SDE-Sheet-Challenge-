import java.util.* ;
import java.io.*; 
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int size = q.size();
			for(int i=0; i<size; i++){
				BinaryTreeNode<Integer> alpha = q.poll();
				if(i!=size-1){
					alpha.next = q.peek();
				}
				if(alpha.left!=null){
					q.add(alpha.left);
				}
				if(alpha.right!=null){
					q.add(alpha.right);
				}
			}
		}
	}
}