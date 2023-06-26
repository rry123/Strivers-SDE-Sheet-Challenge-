import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static void find(ArrayList<String> ans , String s , String t, HashSet<String> set){
         if(s.length()==0){
			 String alpha = t.trim();
			 ans.add(alpha);
			 return;
		 }
		 for(int i=0; i<s.length(); i++){
			 if(set.contains(s.substring(0, i+1))){
				 find(ans, s.substring(i+1), t+" "+s.substring(0, i+1), set);
			 }
		 }
	}

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		HashSet<String> set = new HashSet<>();
		for(String it : dictionary){
			set.add(it);
		}
		ArrayList<String> ans = new ArrayList<>();
		find(ans, s, "", set);
		return ans;
	}
}