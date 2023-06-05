import java.util.* ;
import java.io.*; 
public class Solution {
    public static long merge(long arr[], int low, int mid, int high){
        long count =0;
        int i = low;
        int j = mid+1;
        List<Long> list = new ArrayList<>();
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                 list.add(arr[i]);
                 i++;
            }
            else{
                count+= mid-i+1;
                list.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        while(j<=high){
            list.add(arr[j]);
            j++;
        }
        for(int a= low; a<= high; a++){
            arr[a]= list.get(a-low);
        }
        return count;
    }

    public static long mergesort(long arr[], int l, int r){
        long count=0;
        if(l>=r){
            return 0;
        }
        int mid = (l+r)/2;
        count+=mergesort(arr, l, mid);
        count+=mergesort(arr, mid+1, r);
        count+= merge(arr, l , mid ,r);
        return count;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
         return mergesort(arr, 0, n-1);
    }
}