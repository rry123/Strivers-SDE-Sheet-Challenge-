
public class Solution {

    public static int find(String s1, String s2, int i , int j, int dp[][]){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)== s2.charAt(j)){
            return dp[i][j] = find(s1, s2, i-1, j-1, dp);
        }
        int insert = 1 + find(s1, s2, i, j-1, dp);
        int delete = 1 + find(s1, s2, i-1, j, dp);
        int replace =1 + find(s1, s2, i-1, j-1, dp);
        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int n = str1.length();
        int m = str2.length();
        int dp[][]= new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j]=-1;
            }
        }
        return find(str1, str2, n-1, m-1, dp);
    }
}