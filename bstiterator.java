import java.util.* ;
import java.io.*; 
/*
    Definition of Node class for reference

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

*/
public class Solution {

    static class BSTIterator{
        Stack<TreeNode<Integer>> st = new Stack<>();

        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            pushall(root);
        }

        int next(){
            // Write your code here
            TreeNode<Integer> alpha = st.pop();
            pushall(alpha.right);
            return alpha.data;
        }

        boolean hasNext(){
            // Write your code here
            return !st.isEmpty();
        }
        void pushall(TreeNode<Integer> node){
             while(node!=null){
                 st.push(node);
                 node = node.left;
             }
        }
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
