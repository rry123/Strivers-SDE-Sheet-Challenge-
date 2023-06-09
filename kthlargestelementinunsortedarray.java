import java.util.* ;
import java.io.*; 
public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i: arr){
			pq.add(i);
			if(pq.size()>K){
				pq.poll();
			}
		}
		return pq.poll();
	}
}
