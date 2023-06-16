public class Solution 
{
    public static void find(int [][] mat, int i, int j, int n, int m){
         if(i<0 || j>=m || i>=n || j<0 || mat[i][j]==0){
             return;
         }
         mat[i][j]=0;
         find(mat,   i-1,   j   , n, m);
         find(mat,   i-1,   j+1 , n, m);
         find(mat,   i  ,   j+1 , n, m);
         find(mat,   i+1,   j+1 , n, m);
         find(mat,   i+1,   j   , n, m);
         find(mat,   i+1,   j-1 , n, m);
         find(mat,   i  ,   j-1 , n, m);
         find(mat,   i-1,   j-1 , n, m);
    }
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int ans =0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==1){
                    ans++;
                    find(mat, i, j, n, m);
                }
            }
        }
        return ans;
    }
}