import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] nums)
    {
        //Write your code here
        int low =0;
        int mid = 0;
        int high=nums.length-1;
        while(true){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[high];
                nums[high]= nums[mid];
                nums[mid]= temp;
                high--;
            }
            if(mid>high){
                break;
            }
        }
    }
}