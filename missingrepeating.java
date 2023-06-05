import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int x = n*(n+1)/2;
        int r =-1;
        int sum =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(arr.get(i))){
                set.add(arr.get(i));
            }
            else{
                r = arr.get(i);
            }
            sum+=arr.get(i);
        }
        int m = x-(sum-r);
        int ans[]= new int[2];
        ans[0]=m;
        ans[1]= r;
        return ans;
    }
}