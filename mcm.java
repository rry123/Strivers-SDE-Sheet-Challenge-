import java.util.* ;
import java.io.*; 

public class Solution {
	public static int find(int arr[], int i, int j, int dp[][]){
		if(i==j){
			return 0;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		int min = (int) 1e9;
		for(int k=i; k<j; k++){
			int steps = arr[i-1]* arr[k]*arr[j] + find(arr, i, k, dp)+ find(arr, k+1, j, dp);
			min = Math.min(min, steps);
		}
		return dp[i][j]= min;
	}
	public static int matrixMultiplication(int[] arr , int N) {
		// Write your code here
		int dp[][]= new int[N][N];
		for(int i=0; i<N; i++){
			Arrays.fill(dp[i], -1);
		}
		return find(arr, 1, N-1, dp);
	}
}
    