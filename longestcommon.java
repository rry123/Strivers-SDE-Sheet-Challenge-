
public class Solution {
    public static int find(String s, String t, int dp[][], int ind1, int ind2){
		if(ind1<0 || ind2<0){
			return 0;
		}
		if(dp[ind1][ind2]!=-1){
			return dp[ind1][ind2];
		}
		if(s.charAt(ind1)==t.charAt(ind2)){
			return dp[ind1][ind2]= 1+ find(s, t, dp , ind1-1, ind2-1);
		}
		return dp[ind1][ind2]=  0+ Math.max(find(s, t, dp, ind1-1, ind2), find(s, t, dp, ind1, ind2-1));
	}
	public static int lcs(String s, String t) {
		//Your code goes here
		int n = s.length();
		int m = t.length();
		int dp[][]= new int[n+1][m+1];
		for(int i=0; i<n+1; i++){
			for(int j=0; j<m+1; j++){
				dp[i][j]=-1;
			}
		}
		return find(s, t, dp, n-1, m-1);
    }

}