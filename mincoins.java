import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int arr[]= new int[9];
        arr[0]=1;
        arr[1]= 2;
        arr[2] = 5;
        arr[3] =10;
        arr[4]= 20;
        arr[5] = 50;
        arr[6]= 100;
        arr[7]= 500;
        arr[8]= 1000;
        int x = 8;
        int count = 0;
        while(amount>0){
            if(amount<arr[x]){
                x--;
            }
            else{
                amount = amount - arr[x];
                count++;
            }
        }
        return count;
    }
}
