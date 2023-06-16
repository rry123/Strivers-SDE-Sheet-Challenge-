import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the TreeNode class:

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> find(ArrayList<Integer> arr, TreeNode<Integer> root,  int l, int r){
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        root = new TreeNode<Integer>(arr.get(mid));
        root.left = find(arr, root.left , l, mid-1);
        root.right = find(arr, root.right,  mid+1, r);
        return root;
    }
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        TreeNode<Integer> root = null;
        root =  find(arr,  root, 0 , n-1);
        return root;
    }
}