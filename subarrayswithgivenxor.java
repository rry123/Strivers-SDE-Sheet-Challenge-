import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		int xor = 0;
		int n = arr.size();
		int count=0;
		for(int i=0; i<n; i++){
			xor = xor^arr.get(i);
            if(xor==x){
				count++;
			}
			if(map.containsKey(xor^x)){
				count+= map.get(xor^x);
			}
			map.put(xor, map.getOrDefault(xor, 0)+1);
		}
		return count;
	}
}