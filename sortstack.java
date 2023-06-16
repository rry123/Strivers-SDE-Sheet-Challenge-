import java.util.* ;
import java.io.*; 
public class Solution {
    public static void pushatright(Stack<Integer> st, int val){
         if(st.isEmpty()){
			 st.push(val);
			 return;
		 }
		 if(st.peek()<val){
            st.push(val);
			return;
		 }
		 else{
			 int x = st.pop();
			 pushatright(st, val);
			 st.push(x);
		 }
	}
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.isEmpty()){
			return;
		}
		int x = stack.pop();
		sortStack(stack);
		pushatright(stack, x);
	}

}