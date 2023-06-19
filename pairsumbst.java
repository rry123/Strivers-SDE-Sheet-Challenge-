import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static void find(BinaryTreeNode root, ArrayList<Integer> ans){
		if(root==null){
			return;
		}
		find(root.left, ans);
		ans.add(root.data);
		find(root.right, ans);
	}
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		ArrayList<Integer>ans = new ArrayList<>();
		find(root, ans);
		int l = 0;
		int r = ans.size()-1;
		while(l<r){
			if(ans.get(l)+ans.get(r)==k){
				return true;
			}
			else if(ans.get(l)+ans.get(r)<k){
				l++;
			}
			else{
				r--;
			}
		}
		return false;

	}
}

