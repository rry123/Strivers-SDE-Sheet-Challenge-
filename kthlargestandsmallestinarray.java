import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b)->b-a); 
		PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->a-b);
		for(int i=0; i<arr.size(); i++){
			pq1.add(arr.get(i));
			pq2.add(arr.get(i));
			if(pq1.size()>k){
				pq1.poll();
			}
			if(pq2.size()>k){
				pq2.poll();
			}
		}
		if(!pq1.isEmpty()){
			ans.add(pq1.poll());
		} 
		if(!pq2.isEmpty()){
			ans.add(pq.poll());
		}
		return ans;
	}
}
