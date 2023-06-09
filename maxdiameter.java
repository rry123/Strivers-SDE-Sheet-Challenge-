/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	
	public static int height(TreeNode<Integer> root, int arr[]){
		if(root==null){
			return 0;
		}
		int left = height(root.left, arr);
		int right = height(root.right, arr);
		arr[0]= Math.max(arr[0], left+right);
		return Math.max(left, right)+1;
	}
	
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		int arr[]= new int[1];
		int x = height(root, arr);
		return arr[0];
	}
}