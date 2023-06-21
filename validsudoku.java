public class Solution {

    public static boolean find(int matrix[][], int n){
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j]==0){
					for(int k=1; k<=9; k++){
						if(isvalid(matrix, i, j, k, n)){
							matrix[i][j]=k;
							if(find(matrix, n)==true){
								return true;
							}
							else
							matrix[i][j]=0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public static boolean isvalid(int matrix[][], int row, int col, int k, int n){
		for(int i=0; i<9; i++){
			if(matrix[row][i]==k){
				return false;
			}
			if(matrix[i][col]==k){
				return false;
			}
			if(matrix[3*(row/3)+i/3][3*(col/3)+i%3]==k){
				return false;
			}
		}
		return true;
	}
	public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.
		return find(matrix , 9);


	}
}
