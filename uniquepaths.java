import java.util.* ;
import java.io.*; 
public class Solution {
	public static int find(int m, int n, int i, int j, int dp[][]){
		if(i>=m || j>=n){
			return 0;
		}
		if(i==m-1 && j==n-1){
			return 1;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		int down = find(m, n, i+1, j, dp);
        int right = find(m, n, i , j+1, dp);
		return dp[i][j]= down+right;
	}
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int dp[][]= new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				dp[i][j]=-1;
			}
		}
        return find(m, n, 0, 0, dp);
	}
}