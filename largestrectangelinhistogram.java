import java.util.ArrayList;
import java.util.*;
public class Solution {
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
    int n = heights.size();
    Stack<Integer> st = new Stack<>();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]= heights.get(i);
    }
    int left[]= new int[n];
    left[0]=0;
    st.push(0);
    for(int i=1; i<n; i++){
      if(arr[st.peek()]<arr[i]){
        left[i]=st.peek()+1;
        st.push(i);
      }
      else{
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
          st.pop();
        }
        if(st.isEmpty()){
          left[i]=0;
        }
        else{
          left[i]=st.peek()+1;
        }
        st.push(i);
      }
    }
    int x = n-1;
    int right[]= new int[n];
    Stack<Integer> st1= new Stack<>();
    st1.push(n-1);
    right[n-1]=x;
    for(int i=n-2; i>=0; i--){
      if(arr[st1.peek()]<arr[i]){
        right[i]= st1.peek()-1;
        st1.push(i);
      }
      else{
        while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
          st1.pop();
        }
        if(st1.isEmpty()){
          right[i]=x;
        }
        else{
          right[i]= st1.peek()-1;
        }
        st1.push(i);
      }
    }
    int ans=0;
    for(int i=0; i<n; i++){
      ans= Math.max(ans, (right[i]-left[i]+1)*arr[i]);
    }
    return ans;
    
  }
}