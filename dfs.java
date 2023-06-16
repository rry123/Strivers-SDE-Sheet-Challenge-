import java.util.ArrayList;

public class Solution {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int vis[], ArrayList<Integer> ans){
        vis[node]=1;
        ans.add(node);
        for(int i : adj.get(node)){
            if(vis[i]!=1){
                dfs(i, adj, vis, ans);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.size(); i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        int vis[]= new int[v];
        for(int i=0; i<v; i++){
            if(vis[i]!=1){
                ArrayList<Integer> subans = new ArrayList<>();
                dfs(i, adj, vis, subans);
                ans.add(subans);
            }
        }
        return ans;
    }
}