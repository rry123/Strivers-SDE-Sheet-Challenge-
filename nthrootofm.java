public class Solution {
    public static int check(int n, int mid, int m){
        long ans =1;
        for(int i=1; i<=n; i++){
            ans*= mid;
            if(ans>m){
                return 2;
            }
        }
        if(ans==m){
            return 1;
        }
        return 0;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(n, mid, m)==1){
                return mid;
            }
            else if(check(n, mid, m)==2){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
