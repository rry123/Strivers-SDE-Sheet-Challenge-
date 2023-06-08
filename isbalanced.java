import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

    public static int height(BinaryTreeNode<Integer> root){
        if(root== null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1){
            return -1;
        }
        if(left==-1 || right==-1){
            return -1;
        }
        return Math.max(left, right)+1;
    }
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        int x = height(root);
        if(x!=-1){
            return true;
        }
        return false;
	}
}
