import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
        int i =0;
        int j =0;
        int n = a.length();
        int m = b.length();
        while(i<n || j<m){
            long x = 0;
            long y = 0;
            while(i<n && a.charAt(i)!='.'){
                x+= x*10 + (a.charAt(i)-'0');
                i++;
            }
            while(j<m && b.charAt(j)!='.'){
                y += y*10 +(b.charAt(j)-'0');
                j++;
            }
            if(x>y){
                return 1;
            }
            if(y>x){
                return -1;
                
            }
            i++;
            j++;
        }
        return 0;
    }
}