import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int l=0;
		int r = 0;
		int max = Integer.MIN_VALUE;
		int count =0;
		while(r<n){
			if(arr.get(r)==0){
				count++;
			}
			if(count<=k){
				max = Math.max(max, r-l+1);
				r++;
			}
			if(count>k){
				while(count>k){
					if(arr.get(l)==0){
						count--;
					}
					l++;
				}
				r++;
			}
		}
		if(max==Integer.MIN_VALUE){
			return 0;
		}
		return max;
	}
}