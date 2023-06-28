import java.util.*;
public class Solution {
	public static int find(int price[], int ind, int length, int dp[][]){
		if(ind==0){
			return length*price[ind];
		}
		if(dp[ind][length]!=-1){
			return dp[ind][length];
		}
		int nottake = find(price, ind-1, length, dp);
		int take = 0;
		if(ind+1<=length){
            take = price[ind] +find(price, ind, length-ind-1, dp);
		}
		return dp[ind][length] =  Math.max(take, nottake);
	}
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int dp[][]= new int[n+1][n+1];
		for(int i=0; i<n+1; i++){
			Arrays.fill(dp[i], -1);
		}
        return find(price, n-1, n, dp);
	}
}