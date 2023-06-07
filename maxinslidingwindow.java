import java.util.* ;
import java.io.*; 

import java.util.ArrayList;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
		Deque<Integer> dq = new ArrayDeque<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int n = nums.size();
		int l =0;
		int r=0;
		for(int i=0; i<n; i++){
			if(r-l+1 < k){
				r++;
			}
			while(dq.size()>0 && dq.peekFirst()<=i-k){
				dq.pollFirst();
			}
			while(dq.size()>0 && nums.get(i)>nums.get(dq.peekLast())){
				dq.pollLast();
			}
			dq.add(i);
			if(i>=k-1){
				ans.add(nums.get(dq.peekFirst()));
				l++;
				r++;
			}
		}
		return ans;
	}
}