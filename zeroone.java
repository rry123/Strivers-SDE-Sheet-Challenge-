import java.util.ArrayList;

public class Solution {
	public static int find(ArrayList<Integer> values, ArrayList<Integer> weights, int ind, int w, int dp[][]){
		if(ind==0){
			if(weights.get(ind)<=w){
				return values.get(ind);
			}
			else{
				return 0;
			}
		}
		if(dp[ind][w]!=-1){
			return dp[ind][w];
		}
		int take = 0;
		if(weights.get(ind)<=w){
			take = values.get(ind) + find(values, weights, ind-1, w-weights.get(ind), dp);
		}
		int nottake = 0 + find(values, weights, ind-1, w, dp);
		return dp[ind][w]= Math.max(take, nottake);
	}
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		//int n = weights.size();
		int dp[][]= new int[n][w+1];
		for(int i=0; i<n; i++){
			for(int j=0; j<w+1; j++){
				dp[i][j]=-1;
			}
		}
		return find(values , weights, n-1, w, dp);
	}
}