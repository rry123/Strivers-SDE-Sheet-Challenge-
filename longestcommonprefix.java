
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		String ans = "";
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
             min = Math.min(min , arr[i].length());
		}
		int flag=0;
		for(int i=0;i<min ; i++){
			for(int j=0; j<n; j++){
				if(arr[j].charAt(i)==arr[0].charAt(i)){
					continue;
				}
				else{
					return ans;
				}
			}
			ans+=arr[0].charAt(i);
		}
		return ans;
	}

}
