import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean ispossible(List<List<Integer>> adj, int col, int node, int color[]){
        for(int it : adj.get(node)){
            if(color[it]==col){
                return false;
            }
        }
        return true;
    }
    public static boolean find(int node, int n, List<List<Integer>> adj, int m, int color[]){
        if(node==n){
            return true;
        }
        for(int col=1; col<=m; col++){
            if(ispossible(adj, col , node, color)){
                color[node]= col;
                if(find(node+1, n, adj, m, color)==true){
                    return true;
                }
                else{
                    color[node]=0;
                }
            }
        }
        return false;
    }
    
	public static String graphColoring(int[][] mat, int m) {
		// Write your code here
        List<List<Integer>> adj = new ArrayList<>();
        int n = mat.length;
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int color[]= new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean x = find(0 , n, adj, m, color);
        if(x== true){
            return "YES";
        }
        else{
            return "NO";
        }
	}
}
