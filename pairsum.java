import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(s-arr[i])){
                int ans[]= new int[2];
                
                ans[0]= Math.min(s-arr[i], arr[i]);
                ans[1]= Math.max(s-arr[i], arr[i]);
                for(int j=0; j<map.get(s-arr[i]); j++){
                   list.add(ans);
                }
                //map.put(s)
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Collections.sort(list, (a,b)-> a[0]-b[0]);
        return list;
    }
}
