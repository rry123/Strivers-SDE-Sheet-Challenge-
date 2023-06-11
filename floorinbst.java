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

public class Solution {
    public static void floorr(TreeNode<Integer> root, int x, int arr[]){
        if(root==null){
            return;
        }
        if(root.data <= x){
            arr[0]=root.data;
        }
        if(x<root.data){
            floorr(root.left, x, arr);
        }
        else{
            floorr(root.right, x , arr);
        }
    }

    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        int arr[]= new int[1];
        arr[0]=-1;
        floorr(root, X, arr);
        return arr[0];
    }
}