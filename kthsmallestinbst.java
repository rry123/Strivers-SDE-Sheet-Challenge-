import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{
	 static int count =0;
    public static void find(TreeNode<Integer> root, int k,  List<Integer> ans){
          if(root==null){
			  return;
		  }
		  find(root.left, k, ans);
	       ans.add(root.data);
		  find(root.right, k , ans);
	}
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		List<Integer> ans = new ArrayList<>();
		find(root, k, ans);
		return ans.get(k-1);
	}

}
