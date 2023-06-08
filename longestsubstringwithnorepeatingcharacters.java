import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		int l =0;
		int r =0;
		int n = input.length();
		Set<Character> set = new HashSet<>();
		int ans = 0;
		while(r<n){
			if(!set.contains(input.charAt(r))){
                ans = Math.max(ans, r-l+1);
				set.add(input.charAt(r));
				r++;
			}
			else{
				set.remove(input.charAt(l));
				l++;
			}
		}
		return ans;
	}
}
