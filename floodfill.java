public class Solution
{
    public static void dfs(int [][]arr, int i, int j, int x, int y, int n , int m){
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j]!=y || arr[i][j]==x){
            return;
        }
        arr[i][j]=x;
        dfs(arr, i-1, j, x, y, n, m);
        dfs(arr, i+1, j, x, y, n, m);
        dfs(arr, i, j-1, x, y, n, m);
        dfs(arr, i, j+1, x, y, n, m);
    }
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int n = image.length;
        int m = image[0].length;
        //image[x][y]= newColor;
        dfs(image, x, y, newColor, image[x][y], n, m);
        return image;
    }
}

