import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Tree node structure
	
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

public class Solution {
	public static long find(TreeNode root , long arr[]){
		if(root == null){
			return 0;
		}
		if(root!=null && root.left==null && root.right==null){
			arr[1]++;
		}
		long left = find(root.left, arr);
		long right = find(root.right, arr);
		
		arr[0]= Math.max(arr[0], left+right + root.data);
		return Math.max(root.data+ left, root.data+ right);
	}
	public static long findMaxSumPath(TreeNode root) {
		// Write your code here.
		long arr[]= new long[2];
		arr[0]= Integer.MIN_VALUE;
		if(root==null){
			return -1;
		}
		long x = find(root, arr);
		if(arr[1]==1){
			return -1;
		}
		return arr[0];
	}
}