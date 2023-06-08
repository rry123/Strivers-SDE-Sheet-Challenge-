import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.*;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	Queue<BinaryTreeNode> q = new LinkedList<>();
	q.add(root);
	ArrayList<Integer> ans = new ArrayList<>();
	if(root==null){
		return ans;
	}
	while(!q.isEmpty()){
		int size = q.size();
		for(int i=0; i<size; i++){
			BinaryTreeNode alpha = q.poll();
			ans.add(alpha.val);
			if(alpha.left!=null){
				q.add(alpha.left);
			}
			if(alpha.right!=null){
				q.add(alpha.right);
			}
		}
	}
	return ans;
  }

}