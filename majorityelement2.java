import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int c1=0;
        int c2=0;
        int el1= -1;
        int el2= -1;
        int n = arr.size();
        for(int i=0; i<n; i++){
            if(c1==0 && arr.get(i)!=el2){
                c1=1;
                el1= arr.get(i);
            }
            else if(c2==0 && arr.get(i)!=el1){
                c2=1;
                el2= arr.get(i);
            }
            else if(arr.get(i)==el1){
                c1++;
            }
            else if(arr.get(i)==el2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0; i<n; i++){
            if(arr.get(i)==el1){
                c1++;
            }
            else if(arr.get(i)==el2){
                c2++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(c1>n/3){
            ans.add(el1);
        }
        if(c2>n/3){
            ans.add(el2);
        }
        return ans;
    }
}