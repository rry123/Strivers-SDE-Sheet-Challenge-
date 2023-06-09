public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        int i =0;
        int j=0;
        int count=0;
        int ans =0;
        while(i<m && j<n){
            if(count==k){
                return ans;
            }
            if(row1[i]<=row2[j]){
                ans = row1[i];
                i++;
                count++;
                
            }
            else{
                 ans= row2[j];
                j++;
                count++;
               
            }
        }
        while(i<m){
             if(count==k){
                return ans;
            }
            ans = row1[i];
            i++;
            count++;
            
        }
        while(j<n){
             if(count==k){
                return ans;
            }
             ans= row2[j];
                j++;
                count++;
               
        }
        return ans;
    }
}
