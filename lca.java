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

public class Solution 
{

    public static TreeNode<Integer> lca(TreeNode<Integer> root, int x, int y){
        if(root==null || root.data == x || root.data == y){
            return root;
        }
        TreeNode<Integer> left = lca(root.left, x, y);
        TreeNode<Integer> right= lca(root.right, x, y);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
        //    Write your code here.
         TreeNode<Integer> alpha = lca(root, x, y);
         return alpha.data;
    }
}
