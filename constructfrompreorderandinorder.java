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
    public static TreeNode<Integer> build(ArrayList<Integer> preorder, int prestart, int preend, ArrayList<Integer> inorder, int instart, int inend, Map<Integer, Integer> map){
        if(prestart>preend || instart> inend){
            return null;
        }
        TreeNode<Integer> root = new TreeNode(preorder.get(prestart));
        int ind = map.get(preorder.get(prestart));
        int x = ind - instart;
        root.left = build(preorder, prestart+1, prestart+x, inorder, instart, ind-1, map);
        root.right = build(preorder, prestart+x+1, preend, inorder, ind+1, inend, map);
        return root;
    }
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.size(); i++){
            map.put(inorder.get(i), i);
        }
        TreeNode<Integer> root = build(preorder, 0, preorder.size()-1, inorder, 0, inorder.size()-1, map);
        return root;
    }
}