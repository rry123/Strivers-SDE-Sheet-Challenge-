import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      String ans = "";
      for(int i=0; i<n-3; i++){
        if(i>0 && arr[i]==arr[i-1]){
          continue;
        }
        
        for(int j=i+1; j<n-2; j++){
          if(j>i+1 && arr[j]==arr[j-1]){
            continue;
          }
          int left = j+1;
          int right = n-1;
          while(left<right){
            long sum = arr[i]+arr[j]+arr[left]+arr[right];
            if(sum<target){
              left++;
            }
            else if(sum>target){
              right--;
            }
            else{
              ans = "Yes";
              return ans;
            }
          }
        }
      }
      ans = "No";
      return ans;
  }
}
