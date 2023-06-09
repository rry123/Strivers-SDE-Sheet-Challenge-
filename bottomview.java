import java.util.* ;
import java.io.*; 
/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/

class Pair{
    BinaryTreeNode node;
    int line;
    Pair(BinaryTreeNode node, int line){
        this.node = node;
        this.line = line;
    }
}
public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here.   
         Queue<Pair> q= new LinkedList<>();
         ArrayList<Integer> ans = new ArrayList<>();
         if(root==null){
             return ans;
         }      
         TreeMap<Integer, Integer> map = new TreeMap<>();
         q.add(new Pair(root, 0));
         while(!q.isEmpty()){
             int size = q.size();
             for(int i=0; i<size; i++){
                 Pair alpha = q.poll();
                 map.put(alpha.line , alpha.node.val);
                 if(alpha.node.left!=null){
                     q.add(new Pair(alpha.node.left, alpha.line-1));
                 }
                 if(alpha.node.right!=null){
                     q.add(new Pair(alpha.node.right, alpha.line+1));
                 }
             }
         }
         for(Map.Entry<Integer, Integer> it : map.entrySet()){
             ans.add(it.getValue());
         }
         return ans;
    }
}
