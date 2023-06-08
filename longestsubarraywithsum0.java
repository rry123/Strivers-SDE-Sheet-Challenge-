import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		int sum=0;
		int n = arr.size();
		for(int i=0; i<n; i++){
			sum+=arr.get(i);
			if(sum==0){
				ans=Math.max(ans, i+1);
			}
			if(map.containsKey(sum)){
				ans = Math.max(i-map.get(sum), ans);
			}
			if(!map.containsKey(sum))
			map.put(sum, i);
		}
		return ans;
	}
}