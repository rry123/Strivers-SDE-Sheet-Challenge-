public class Solution {

	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
		int count =0;
		for(int i=0; i<n; i++){
			if(s.charAt(i)==p.charAt(0)){
				int len = p.length();
				if(i+len<=n){
					String str = s.substring(i, i+len);
					if(str.equals(p)){
						count++;
					//	i = i+len-1;
					}
				}
			}
		}
		return count;

	}

}