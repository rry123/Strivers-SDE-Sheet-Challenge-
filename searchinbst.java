import java.util.* ;
import java.io.*; 
/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/

public class Solution {
	public static boolean search(BinaryTreeNode<Integer> root, int x){
		if(root==null){
			return false;
		}
		if(root.data==x){
			return true;
		}
		boolean left = false;
		boolean right = false;
		if(x<root.data){
		    left = search(root.left, x);
		}
		if(x>root.data){
			right = search(root.right, x);
		}
		return left | right;
	}
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		return search(root, x);
	}
}