import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(arr.get(i))){
                set.add(arr.get(i));
            }
            else{
                return arr.get(i);
            }
        }
        return -1;
    }
}
