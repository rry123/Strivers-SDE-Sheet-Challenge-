import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        int arr1[]= new int[26];
        int arr2[] = new int[26];
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            arr1[str1.charAt(i)-'a']++;
            arr2[str2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}