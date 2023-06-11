import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		int l =0;
		int r=0;
		int n = arr.size();
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		while(r<n){
			map.put(arr.get(r), map.getOrDefault(arr.get(r), 0)+1);
		   if(r-l+1<k){
			   r++;
		   }
		   else if(r-l+1==k){
			   ans.add(map.size());
			   int x = map.get(arr.get(l));
			   x = x-1;
			   if(x==0){
				   map.remove(arr.get(l));
			   }
			   else{
				   map.put(arr.get(l),x);
			   }
			   l++;
			   r++;
		   }
		}
		return ans;
	}
}
