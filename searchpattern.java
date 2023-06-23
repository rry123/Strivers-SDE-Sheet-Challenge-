import java.util.List;
import java.util.*;
public class Solution {
    public static List< Integer > stringMatch(String text, String pattern){
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==pattern.charAt(0)){
                int len = pattern.length();
                if(i+len<=text.length()){
                    String s1 = text.substring(i, i+len);
                    if(s1.equals(pattern)){
                        ans.add(i+1);
                    }
                }
            }
        }
        return ans;
    }
}