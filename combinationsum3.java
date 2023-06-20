import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static void find(ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> subans, ArrayList<Integer> arr, int ind, int n , int target){
        if(target==0){
            ans.add(new ArrayList<>(subans));
            return;
        }
        for(int i=ind; i<n; i++){
            if(i!=ind && arr.get(i)==arr.get(i-1)){
                continue;
            }
            if(arr.get(i)>target){
                break;
            }
            subans.add(arr.get(i));
            find(ans, subans, arr, i+1, n, target-arr.get(i));
            subans.remove(subans.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        find(ans, subans,arr, 0, n, target);
        return ans;
    }
}