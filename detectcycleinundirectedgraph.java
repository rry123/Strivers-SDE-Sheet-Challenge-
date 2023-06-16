import java.util.*;
class Pair{
    int node;
    int parent;
    Pair(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
}
public class Solution {
    public static boolean check(int src, List<List<Integer>> adj, int vis[]){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
         vis[src]=1;
        while(!q.isEmpty()){
            Pair alpha = q.poll();
            int node = alpha.node;
            int parent = alpha.parent;
            for(int it : adj.get(node)){
                
                if(vis[it]!=1){
                    
                    vis[it]=1;
                    q.add(new Pair(it, node));
                }
                else if(parent!=it){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
             adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[]= new int[n+1];
        for(int i=1; i<=n; i++ ){
            if(vis[i]==0){
                if(check(i, adj, vis)){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    
}