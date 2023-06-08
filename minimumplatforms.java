import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int ans = 0;
        int plat =0;
        int i=0;
        int j =0;
        while(i<n){
            if(at[i]<=dt[j]){
                i++;
                plat++;
            }
            else{
                plat--;
                j++;
            }
            ans = Math.max(plat, ans);
        }
        return ans;
    }
}