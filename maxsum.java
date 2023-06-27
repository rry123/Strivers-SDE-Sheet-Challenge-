import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int find(ArrayList<Integer> arr , int n , int ind,  int prev , int dp[][]){
        if(ind==n){
            return 0;
        }
        int take = 0;
        if(dp[ind][prev+1]!=-1){
            return dp[ind][prev+1];
        }
        if(prev==-1 || arr.get(ind)> arr.get(prev)){
            take = arr.get(ind) + find(arr, n, ind+1, ind, dp);
        }
        int nottake = 0 + find(arr, n , ind+1, prev, dp);
        return dp[ind][prev+1]= Math.max(take, nottake);
    }
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int dp[][]= new int[n][n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n+1; j++){
                dp[i][j]=-1;
            }
        }
        return find(rack, n , 0 , -1, dp);
    }
}