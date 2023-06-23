import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }
        String s = "11";
        for(int i=3; i<=n; i++){
            s = s+"&";
            String t = "";
            int counter=1;
            for(int j=1; j<s.length(); j++){
                if(s.charAt(j)!= s.charAt(j-1)){
                    t= t+String.valueOf(counter);
                    t+= s.charAt(j-1);
                    counter = 1;
                }
                else{
                    counter++;
                }
            }
            s = t;
        }
        return s;
    }
}