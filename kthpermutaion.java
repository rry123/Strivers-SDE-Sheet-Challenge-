import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
         int fact =1;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
             fact = fact*i;
             list.add(i);
        }
        list.add(n);
        k= k-1;
        String ans ="";
        while(true){
             ans+= String.valueOf(list.get(k/fact));
             list.remove(list.get(k/fact));
             if(list.size()==0){
                 break;
             }
             k = k%fact;
             fact = fact/list.size();
        }
        return ans;
    }
}