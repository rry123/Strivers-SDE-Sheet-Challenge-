import java.util.* ;
import java.io.*; 
class Pair{
	int first;
	int second;
	Pair(int first, int second){
		this.first = first;
		this.second = second;
	}
}
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.second-a.second);
		for(Map.Entry<Integer, Integer> it : map.entrySet()){
			pq.add(new Pair(it.getKey(), it.getValue()));
		}
		int ans[]= new int[k];
		int a = 0;
		while(k>0 && !pq.isEmpty()){
			Pair alpha = pq.poll();
			ans[a++]= alpha.first;
			k--;
		}
		return ans;
	}

}
