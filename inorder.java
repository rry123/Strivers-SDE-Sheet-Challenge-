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
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null){
            return ans;
        }
        TreeNode node = root;
        while(true){
           if(node!=null){
               st.push(node);
               node = node.left;
           }
           else{
               if(st.isEmpty()){
                   break;
               }
               node  = st.pop();
               ans.add(node.data);
               node = node.right;
           }
        }
        return ans;
    }
}