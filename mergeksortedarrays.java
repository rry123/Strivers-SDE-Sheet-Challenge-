import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(ArrayList<Integer> it : kArrays){
			for(int i : it){
				pq.add(i);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while(!pq.isEmpty()){
             ans.add(pq.poll());
		}
		return ans;
	}
}
