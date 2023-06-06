import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int ans = 0;
        for(int i=0; i<N i++){
            if(!set.contains(arr[i]-1)){
                int x = arr[i];
                int len = 0;
                while(set.contains(x)){
                    len++;
                    x++;
                }
                ans= Math.max(ans, len);
            }
        }
        return ans;
    }
}