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

class Pair{
    TreeNode<Integer> node;
    int row ;
    Pair(TreeNode<Integer> node , int row){
        this.node = node;
        this.row = row;
    }
}
public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(root== null){
            return ans;
        }
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair alpha = q.poll();
                TreeNode<Integer> node = alpha.node;
                int x = alpha.row;
                if(!map.containsKey(x)){
                    map.put(x, new ArrayList<>());
                }
                map.get(x).add(node.data);
                if(node.left!=null){
                    q.add(new Pair(node.left, x-1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right, x+1));
                }
            }
        }
        for(ArrayList<Integer> it : map.values()){
            for(int x : it){
                ans.add(x);
            }
        }
        return ans;
    }
}
