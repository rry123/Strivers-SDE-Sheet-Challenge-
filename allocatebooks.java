import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean ispossible(long mid, int time[], int n, int m){
        long persons= 1;
        long pages= 0;
        for(int i=0; i<n; i++){
            if(time[i]>mid){
                return false;
            }
            if(pages+time[i]>mid){
                persons+=1;
                pages=time[i];
            }
            else{
                pages+=time[i];
            }
        }
        if(persons<=m){
            return true;
        }
        else{
            return false;
        }
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long l = Integer.MAX_VALUE;
        long h = 0;
        for(int i=0; i<m; i++){
            l = Math.min(l, time[i]);
            h += time[i];
        }
        while(l<=h){
            long mid = (l + h)/2;
            if(ispossible(mid, time, m , n)){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}