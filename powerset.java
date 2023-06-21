import java.util.* ;
import java.io.*; 
public class Solution {
	public static void find(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> subans, ArrayList<Integer> arr,  int i){
		if(i==arr.size()){
			ans.add(new ArrayList<>(subans));
			return;
		}
		subans.add(arr.get(i));
		find(ans, subans, arr, i+1);
		subans.remove(subans.size()-1);
		find(ans, subans, arr, i+1);
	}
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> subans = new ArrayList<>();
		find(ans, subans, arr, 0);
		return ans;
	}
}

