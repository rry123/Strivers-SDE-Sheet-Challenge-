import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static void find(ArrayList<Integer> price,  ArrayList<Integer> ans){
        int n = price.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                st.push(i);
                ans.add(i+1);
            }
            else{
                while(!st.isEmpty() &&  price.get(i)>=price.get(st.peek())){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(i+1);
                }
                else{
                    ans.add(i-st.peek());
                }
                st.push(i);
            }
        }
    }
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        int n = price.size();
        int arr[]= new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        find(price,  ans);
        return ans;
    }
}