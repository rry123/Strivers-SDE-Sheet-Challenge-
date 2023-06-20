import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
                  pq.add(a.get(i)+b.get(j));
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<k; i++){
			ans.add(pq.poll());
		}
		return ans;
	}
}