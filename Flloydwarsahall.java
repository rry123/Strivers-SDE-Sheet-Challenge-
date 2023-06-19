import java.util.ArrayList;

public class Solution {
  static int floydWarshall(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
    // Write your code here.
    int arr[][]= new int[n+1][n+1];
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        if(i==j){
          arr[i][j]=0;
        }
        else{
          arr[i][j]= (int)1e9;
        }
      }
    }
    for(int i=0; i<m; i++){
      int u = edges.get(i).get(0);
      int v = edges.get(i).get(1);
      int w = edges.get(i).get(2);
      arr[u][v] = w;
    }
    for(int via=1; via<=n; via++){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
          if(arr[i][via]!= (int)1e9 && arr[via][j]!= (int)1e9)
          arr[i][j]= Math.min(arr[i][via]+ arr[via][j], arr[i][j]);
        }
      }
    }
    return arr[src][dest];
  }

}
