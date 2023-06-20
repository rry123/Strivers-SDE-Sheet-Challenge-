import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int i=0;
        int n = mat.size();
        int m = mat.get(0).size();
        int j =m-1;
        while(i<n && j>=0){
            if(mat.get(i).get(j)==target){
                return true;
            }
            else if(mat.get(i).get(j)<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
