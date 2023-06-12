import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	 public static void find(TreeNode<Integer> root, int k,  List<Integer> ans){
          if(root==null){
			  return;
		  }
		  find(root.left, k, ans);
	       ans.add(root.data);
		  find(root.right, k , ans);
	}
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
		List<Integer> ans = new ArrayList<>();
		find(root, k, ans);
		int n = ans.size();
		if(n-k<0){
			return -1;
		}
		return ans.get(n-k);
	}
}