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

import java.util.*;
public class Solution 
{
    public static String serializeTree(TreeNode<Integer> root)
    {
        //    Write your code here for serialization of the tree.
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if(root == null){
            return " ";
        }
        
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<Integer> alpha = q.poll();
            if(alpha==null){
                sb.append("# ");
                continue;
            }
            sb.append(String.valueOf(alpha.data+" "));
            q.add(alpha.left);
            q.add(alpha.right);
        }
        return sb.toString();
    }
    
    public static TreeNode<Integer> deserializeTree(String str)
    {
        //    Write your code here for deserialization of the tree.
        if(str==" "){
            return null;
        }
        String alpha[]= str.split(" ");
        TreeNode<Integer> root = new TreeNode(Integer.valueOf(alpha[0]));
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        for(int i =1; i<alpha.length; i++){
            TreeNode<Integer> node = q.poll();
            if(!alpha[i].equals("#")){
                 TreeNode<Integer> left = new TreeNode<>(Integer.valueOf(alpha[i]));
                 node.left = left;
                 q.add(left);
            }
            if(!alpha[++i].equals("#")){
                TreeNode<Integer> right = new TreeNode<>(Integer.valueOf(alpha[i]));
                 node.right = right;
                 q.add(right);
            }
        }
        return root;
    }
}
