import java.util.* ;
import java.io.*; 
public class Solution {
 
    public static void recur(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer>subans, int ind, int n , int arr[]){
        
        ans.add(new ArrayList<>(subans));
        for(int i=ind; i<n; i++){
            if(i!=ind && arr[i]==arr[i-1]){
                continue;
            }
            subans.add(arr[i]);
            recur(ans, subans , i+1, n, arr);
            subans.remove(subans.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        recur(ans, subans , 0, n, arr);
        return ans;
    }

}