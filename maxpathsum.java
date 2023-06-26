import java.util.* ;
import java.io.*; 
public class Solution {
    public static int find(int arr[][], int i, int j, int dp[][]){
         if(i<0 || j<0){
            return (int)1e9;
        }
        if(i==0 && j==0){
            return arr[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up = arr[i][j] + find(arr, i-1, j , dp);
        int left = arr[i][j] + find(arr, i, j-1, dp);
        return dp[i][j] = Math.min(up, left);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int n = grid.length;
        int m = grid[0].length;
        int dp[][]= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j]=-1;
            }
        }
        return find(grid, n-1, m-1, dp);
    }
}