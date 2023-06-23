import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean ispossible(long mid, int arr[], int n, int m){
        long persons=1;
        long prev= arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]-prev>=mid){
                persons++;
                prev = arr[i];
            }
            if(persons==m){
                return true;
            }
        }
        return false;
    }

    public static int chessTournament(int[] positions, int n,  int m) 
	{
        // Write your code here.    
        Arrays.sort(positions);
        long l = 0;
        long r = positions[n-1]-positions[0];
        int ans=-1;
        while(l<=r){
            long mid = (l+r)/2;
            if(ispossible(mid, positions, n, m)){
                ans = (int)mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ans;
    }

}