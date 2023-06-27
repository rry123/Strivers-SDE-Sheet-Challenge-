import java.util.* ;
import java.io.*; 
public class Solution {
    public static int find(HashSet<String> set,  HashMap<String, Integer> map ,  String s){
        if(s.length()==0){
            return 1;
        }
        if(map.get(s)!=null){
            return map.get(s);
        }
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.substring(0, i+1))){
                int x = find(set, map , s.substring(i+1));
                if(x==1)
                map.put(s.substring(0, i+1), 1);
                
                return x;
                
            }
        }
        map.put(s, -1);
        return -1;
       
    }
    public static Boolean wordBreak(String[] arr, int n, String s) {
        // Write your code here.
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String it : arr){
            set.add(it);
        }
        return find(set, map , s)== 1 ? true : false;
    }
}