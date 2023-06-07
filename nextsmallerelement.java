import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        list.add(-1);
        st.push(arr.get(n-1));
        for(int i=n-2; i>=0; i--){
             if(arr.get(i)>st.peek()){
                 list.add(st.peek());
                 st.push(arr.get(i));
             }
             else{
                 while(!st.isEmpty() && st.peek()>=arr.get(i)){
                     st.pop();
                 }
                 if(st.isEmpty()){
                     list.add(-1);
                 }
                 else{
                     list.add(st.peek());
                 }
                 st.push(arr.get(i));
             }
        }
        Collections.reverse(list);
        return list;
    }
}