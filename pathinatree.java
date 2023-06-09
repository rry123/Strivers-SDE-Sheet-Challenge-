import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static void path(TreeNode root, int x, ArrayList<Integer> ans, ArrayList<Integer> ans1){
        if(root==null){
            return;
        }
        ans.add(root.data);
        if(root.data == x){
            for(int i : ans){
                ans1.add(i);
            }
        }
        path(root.left, x, ans, ans1);
        path(root.right, x, ans, ans1);
        ans.remove(ans.size()-1);

    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        ArrayList<Integer> ans1 = new ArrayList<>();
        path(root, x, ans, ans1);
        return ans1;

    }
}