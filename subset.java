import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        return recurse(0,0,k,arr,dp)==1 ? true : false;
        
        
    }
    public static int recurse(int i,int curr,int k,int[] arr,int[][] dp)
    {
        
        if(i==arr.length || curr==k)
        {
            if(curr==k)return 1;
            return -1;
        }
        if(dp[i][curr]!=0)return dp[i][curr];
        int take= 0,notake = 0;

        if(arr[i]+curr<=k)
        {
            take = recurse(i+1,curr+arr[i],k,arr,dp);
        }
        notake = recurse(i+1,curr,k,arr,dp);

        if(take==1 || notake==1){
            dp[i][curr] = 1;
        }
        else{
            dp[i][curr] = -1;
        }

        return dp[i][curr];
    }
}