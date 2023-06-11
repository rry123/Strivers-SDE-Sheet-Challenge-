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

    public static void ceill(TreeNode<Integer> node , int x, int arr[]){
        if(node==null){
            return;
        }
        if(node.data>=x){
            arr[0]=node.data;
        }
        if(x<node.data){
            ceill(node.left, x, arr);
        }
        if(x>node.data){
            ceill(node.right, x, arr);
        }
    }
    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        int arr[]= new int[1];
        arr[0]=-1;
        ceill(node, x, arr);
        return arr[0];

    }
}
