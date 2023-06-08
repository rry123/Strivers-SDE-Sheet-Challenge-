import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
	public static void inorder(BinaryTreeNode<Integer> root, List<Integer> list){
		if(root == null){
			return;
		}
        inorder(root.left, list);
		list.add(root.data);
		inorder(root.right, list);
	}
	public static void preorder(BinaryTreeNode<Integer> root, List<Integer> list){
		if(root == null){
			return;
		}
		list.add(root.data);
        preorder(root.left, list);
		preorder(root.right, list);
	}
	public static void postorder(BinaryTreeNode<Integer> root, List<Integer> list){
		if(root == null){
			return;
		}
        postorder(root.left, list);
		postorder(root.right, list);
		list.add(root.data);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ino = new ArrayList<>();
		List<Integer> pre = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		inorder(root, ino);
		preorder(root, pre);
		postorder(root, post);
		ans.add(ino);
		ans.add(pre);
		ans.add(post);
		return ans;
    }
}
