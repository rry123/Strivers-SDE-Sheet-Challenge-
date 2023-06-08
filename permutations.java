import java.util.* ;
import java.io.*; 
public class Solution {
    public static void find(StringBuilder sb, List<String> ans, int ind){
        if(ind==sb.length()){
            String alpha = sb.toString();
            ans.add(alpha);
            return;
        }
        for(int i= ind; i<sb.length(); i++){
            char x = sb.charAt(i);
            char y = sb.charAt(ind);
            sb.setCharAt(ind, x);
            sb.setCharAt(i, y);
            find(sb, ans , ind+1);
            sb.setCharAt(ind, y);
            sb.setCharAt(i, x);
        }
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        find(sb, ans ,0);
        return ans;
    }
}