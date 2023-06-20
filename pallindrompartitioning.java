import java.util.* ;
import java.io.*; 
public class Solution {
     public static boolean ispallindrome(String s){
        int l =0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void fill(List<List<String>> ans, List<String> subans, int ind, String s){
        if(ind==s.length()){
            ans.add(new ArrayList<>(subans));
            return;
        }
        for(int i= ind ; i<s.length(); i++){
            if(ispallindrome(s.substring(ind, i+1))){
                subans.add(s.substring(ind, i+1));
                fill(ans, subans, i+1, s);
                subans.remove(subans.size()-1);
            }
        }
    }
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> ans = new ArrayList<>();
        List<String> subans = new ArrayList<>();
        fill(ans, subans, 0,  s);
        return ans;
    }
}