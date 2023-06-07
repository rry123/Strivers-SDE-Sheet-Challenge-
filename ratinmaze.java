import java.util.* ;
import java.io.*; 
public class Solution {
    public static void fill(ArrayList<ArrayList<Integer>>ans , ArrayList<Integer>subans, int i, int j, int n, int vis[][], int maze[][]){
        if(i==n-1 && j==n-1){
            if(maze[i][j]==1){
            vis[i][j]=1;
            for(int k=0; k<n; k++){
                for(int l=0; l<n; l++){
                    subans.add(vis[k][l]);
                }
            }
            ans.add(new ArrayList<>(subans));
            subans.clear();
            vis[i][j]=0;
            }
            return;
        }
        if(j<0 || j>=n || i<0 || i>=n || vis[i][j]==1 || maze[i][j]==0 ){
            return;
        }
        
        vis[i][j]=1;
        fill(ans, subans, i, j-1, n, vis, maze);
        fill(ans, subans, i, j+1, n, vis, maze);
        fill(ans, subans, i-1, j, n, vis, maze);
        fill(ans, subans, i+1, j, n, vis, maze);
        vis[i][j]=0;
        
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        int vis[][]= new int[n][n];
        fill(ans, subans, 0, 0, n, vis, maze);
        return ans;
    }
}