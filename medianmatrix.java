import java.util.ArrayList;

public class Solution
{
	public static int findlessequal(ArrayList<Integer> list , int m){
          int l =0;
		  int h = list.size()-1;
		  while(l<=h){
			  int mid = (l+h)/2;
			  if(list.get(mid)<=m){
				  l = mid+1;
			  }
			  else{
				  h = mid-1;
			  }
		  }
		  return l;
	}
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		int l = 1;
		int h = (int)1e9;
		int n = matrix.size();
		int m  = matrix.get(0).size();
		while(l<=h){
			int mid = (l+h)/2;
			int count = 0;
			for(int i=0; i<n ; i++){
				count+= findlessequal(matrix.get(i), mid);
			}
			if(count<= (n*m)/2){
				l = mid+1;
			}
			else{
				h = mid-1;
			}
		}
		return l;
	}
}