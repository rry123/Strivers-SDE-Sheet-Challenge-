import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int ans=0;
        int min = Integer.MAX_VALUE;
        int n = prices.size();
        for(int i=0; i<n; i++){
            min = Math.min(prices.get(i), min);
            ans = Math.max(ans, prices.get(i)-min);
        }
        return ans;
    }
}