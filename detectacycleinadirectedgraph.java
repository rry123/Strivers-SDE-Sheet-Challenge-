import java.util.ArrayList;
public class Solution {
  public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, int vis[], int pathvis[]){
    vis[node]=1;
    pathvis[node]=1;
    for(int it : adj.get(node)){
      if(vis[it]==0){
        if(dfs(adj, it, vis, pathvis)==true){
          return true;
        }
      }
      else if(pathvis[it]==1){
          return true;
      }
    }
    pathvis[node]=0;
    return false;
  }
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> adj) {
    // Write your code here.
    int vis[]= new int[n+1];
    int pathvis[]= new int[n+1];
    ArrayList<ArrayList<Integer>>adj1 = new ArrayList<>();
    for(int i=0; i<=n; i++){
      adj1.add(new ArrayList<>());
    }
    int m = adj.size();
    for(int i=0; i<m; i++){
      adj1.get(adj.get(i).get(0)).add(adj.get(i).get(1));
    }
    for(int i=1; i<=n; i++){
      if(vis[i]==0){
        if(dfs(adj1, i, vis, pathvis)==true){
          return true;
        }
      }
    }
    return false;
  }
}