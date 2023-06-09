import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.*;

public class Solution {
	public static boolean isleaf(TreeNode root){
		if(root.left==null && root.right==null){
			return true;
		}
		return false;
	}
	public static void leafnode(TreeNode root, ArrayList<Integer> ans){
		if(root==null){
			return;
		}
		if(root.left == null && root.right == null){
			ans.add(root.data);
		}
		leafnode(root.left, ans);
		leafnode(root.right, ans);
	}
	public static void leftb(TreeNode root, ArrayList<Integer> ans){
		if(root == null){
			return;
		}
		if(!isleaf(root)){
			ans.add(root.data);
		}
		if(root.left == null){
			leftb(root.right, ans);
		}
		else{
			leftb(root.left, ans);
		}
	}
	public static void rightb(TreeNode root, Stack<Integer> st){
		if(root==null){
			return;
		}
		if(!isleaf(root)){
			st.push(root.data);
		}
		if(root.right==null){
			rightb(root.left, st);
		}
		else{
			rightb(root.right, st);
		}
	}
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> leafs = new ArrayList<>();
		ArrayList<Integer> lbound = new ArrayList<>();
		if(root==null){
			return ans;
		}
		ans.add(root.data);
		leftb(root.left, lbound);
		leafnode(root.left, leafs);
		leafnode(root.right, leafs);
		rightb(root.right, st);
		for(int i : lbound){
			ans.add(i);
		}
		for(int i : leafs){
			ans.add(i);
		}
		while(!st.isEmpty()){
			ans.add(st.pop());
		}
		return ans;
	}
}