
public class Solution {
    public static boolean check(String s , int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int n = str.length();
        int i = n-1;
        while(i>0){
            if(str.charAt(i)==str.charAt(0)){
                if(check(str, 0, i)){
                    return n-1-i;
                }
            }
            i--;
        }
        return n-1;
    }

}
public class Solution {
    public static boolean check(String s , int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int n = str.length();
        int i = n-1;
        while(i>0){
            if(str.charAt(i)==str.charAt(0)){
                if(check(str, 0, i)){
                    return n-1-i;
                }
            }
            i--;
        }
        return n-1;
    }

}