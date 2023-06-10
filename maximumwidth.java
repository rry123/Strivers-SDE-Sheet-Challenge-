import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/


public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
		if(root == null){
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int ans = 0;
		while(!q.isEmpty()){
			ans= Math.max(ans, q.size());
			int size = q.size();
			for(int i=0; i<size ; i++){
				TreeNode alpha = q.poll();
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