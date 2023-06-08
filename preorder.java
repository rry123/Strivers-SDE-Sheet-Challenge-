import java.util.* ;
import java.io.*; 
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> ans = new ArrayList<>();
		if(root == null){
			return ans;
		}
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		while(!st.isEmpty()){
			TreeNode alpha = st.pop();
			ans.add(alpha.data);
			if(alpha.right!=null){
				st.push(alpha.right);
			}
			if(alpha.left!=null){
				st.push(alpha.left);
			}
		}
		return ans;
    }
}