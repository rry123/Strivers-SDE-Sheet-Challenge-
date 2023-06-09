import java.util.* ;
import java.io.*; 
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		Queue<BinaryTreeNode<Integer>>q = new LinkedList<>();
		q.add(root);
		int flag=0;
		List<Integer> list = new ArrayList<>();
		if(root==null){
			return list;
		}
		while(!q.isEmpty()){
             int size = q.size();
			 List<Integer> subans = new ArrayList<>();
			 for(int i=0; i<size; i++){
                  BinaryTreeNode<Integer> alpha = q.poll();
				  subans.add(alpha.data);
				  if(alpha.left!=null){
					  q.add(alpha.left);
				  }
				  if(alpha.right!=null){
					  q.add(alpha.right);
				  }
			 }
			 if(flag==0){
				 for(int i : subans){
					 list.add(i);
				 }
				 flag=1;
			 }
			 else{
				 Collections.reverse(subans);
				 for(int i : subans){
					 list.add(i);
				 }
				 flag = 0;
			 }
		}
		return list;

	}
}
