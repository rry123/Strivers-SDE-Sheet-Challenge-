
import java.util.*;
public class Solution {
	public static long find(int arr[], int ind, int target, long dp[][]){
		if(ind==0){
			if(target% arr[ind] == 0){
				return 1;
			}
			else{
				return 0;
			}
		}
		if(dp[ind][target]!=-1){
			return dp[ind][target];
		}
		long nottake = 0 + find(arr, ind-1, target, dp);
		long take = 0;
		if(arr[ind]<=target){
			take = find(arr, ind, target- arr[ind], dp);
		}
		return dp[ind][target] =take+ nottake;
	}

	public static long countWaysToMakeChange(int arr[], int value){
        //write your code here		
		int n = arr.length;
		long dp[][]= new long[n][value+1];	
        for(int i=0; i<n; i++){
			Arrays.fill(dp[i], -1);
		}
		return find(arr, n-1, value, dp);
	}
	
}