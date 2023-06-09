import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int x = q.size();
            ans.add(q.peek().data);
            for(int i=0; i<x; i++){
                TreeNode<Integer> alpha = q.poll();
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
