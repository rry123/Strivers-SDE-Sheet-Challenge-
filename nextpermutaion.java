import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	 public static void reverse(int []nums , int l, int r){
        while(l<=r){
            int temp = nums[l];
            nums[l]= nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		
		int n = permutation.size();
		int nums[]= new int[n];
		for(int i=0; i<n; i++){
			nums[i]= permutation.get(i);
		}
		 int ind=-1;    //to store the dip
        for(int i= n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums , 0, n-1);
			for(int i=0; i<n; i++){
				permutation.set(i, nums[i]);
			}
            return permutation;
        }
        for(int i=n-1; i>=ind+1; i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]= nums[ind];
                nums[ind]= temp;
                break;
            }
        }
        reverse(nums , ind+1, n-1);
		for(int i=0; i<n; i++){
				permutation.set(i, nums[i]);
			}
            return permutation;
	}
}
