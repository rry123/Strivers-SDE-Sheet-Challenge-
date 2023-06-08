import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr){
			set.add(i);
		}
		return set.size();
	}
}