import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer> st = new Stack<>();
		int ans[]= new int[n];
		ans[n-1]=-1;
		st.push(arr[n-1]);
		for(int i = n-2; i>=0; i--){
			if(arr[i]<st.peek()){
				ans[i]=st.peek();
				st.push(arr[i]);
			}
			else{
				while(!st.isEmpty() && arr[i]>=st.peek()){
					st.pop();
				}
				if(st.isEmpty()){
					ans[i]=-1;
				}
				else{
					ans[i]=st.peek();
				}
				st.push(arr[i]);
			}
		}
		return ans;
		
	}

}
