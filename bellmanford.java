import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
      int dis[]= new int[n+1];
      for(int i=0; i<=n; i++){
        dis[i]= (int)1e9;
      }
      dis[src]=0;
      for(int j=0; j<n-1; j++){
        for(int i=0; i<edges.size(); i++){
        int u= edges.get(i).get(0);
        int v = edges.get(i).get(1);
        int w = edges.get(i).get(2);
        if(dis[u]!= (int)1e9 && dis[u]+w < dis[v]){
          dis[v]= dis[u]+w;
        }
        }
      }
      return dis[dest];
    }
    
}
