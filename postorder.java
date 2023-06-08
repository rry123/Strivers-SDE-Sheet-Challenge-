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
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        if(root == null){
            return ans;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode alpha = s1.pop();
            s2.push(alpha);
            if(alpha.left!=null){
                s1.push(alpha.left);
            }
            if(alpha.right!=null){
                s1.push(alpha.right);
            }
        }
        while(!s2.isEmpty()){
            ans.add(s2.pop().data);
        }
        return ans;
    }
}