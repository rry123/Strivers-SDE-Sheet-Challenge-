import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ele=arr[0];
		int count=1;
		for(int i=1; i<n; i++){
			if(count==0){
				count=1;
				ele= arr[i];
			}
			else if(arr[i]==ele){
				count++;
			}
			else{
				count--;
			}
		}
		count=0;
		for(int i=0; i<n; i++){
			if(arr[i]==ele){
				count++;
			}
		}
		if(count>n/2){
			return ele;
		}
		return -1;
	}
}