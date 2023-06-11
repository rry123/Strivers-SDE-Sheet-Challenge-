import java.util.* ;
import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {

 
    public static TreeNode<Integer> construct(int []preorder, int l, int r){
		if(l>r){
			return null;
		}
		int mid = (l+r)/2;
		TreeNode<Integer> root = new TreeNode<>(preorder[mid]);
		root.left = construct(preorder, l, mid-1);
		root.right = construct(preorder, mid+1, r);
		return root;
	}
	public static TreeNode<Integer> preOrderTree(int[] preorder) {
 		// Write your code here
		Arrays.sort(preorder);
		int n =preorder.length;
		int l =0;
		int r = n-1;
		TreeNode<Integer> root = construct(preorder, l , r);
		return root;

	}

}
