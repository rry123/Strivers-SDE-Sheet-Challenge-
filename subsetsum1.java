import java.util.* ;
import java.io.*; 
public class Solution {
    public static void find(ArrayList<Integer> ans , int i, int num[], int sum){
        if(i==num.length){
            int x = sum;
            ans.add(sum);
            return;
        }
        sum+=num[i];
        find(ans, i+1, num, sum);
        sum-=num[i];
        find(ans, i+1, num, sum);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> ans = new ArrayList<>();
        find(ans, 0, num, 0);
        Collections.sort(ans);
        return ans;
    }

}