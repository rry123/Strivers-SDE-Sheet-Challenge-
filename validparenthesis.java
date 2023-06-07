import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String exp) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        int n = exp.length();
        for(int i=0; i<n; i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='['){
                st.push(exp.charAt(i));
            }
            else{
                if(exp.charAt(i)==')'){
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(exp.charAt(i)=='}'){
                    if(!st.isEmpty() && st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(exp.charAt(i)==']'){
                    if(!st.isEmpty() && st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}