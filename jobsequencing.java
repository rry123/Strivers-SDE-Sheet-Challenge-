import java.util.* ;
import java.io.*; 
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class mycompare implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        if(a.second!=b.second){
            return b.second-a.second;
        }
        else{
            return b.first-a.first;
        }
    }
}
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        int profit =0;
        List<Pair> list = new ArrayList<>();
        int n = jobs.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, jobs[i][0]);
            list.add(new Pair(jobs[i][0], jobs[i][1]));
        }
        Collections.sort(list , new mycompare());
        int arr[]= new int[max+1];
        for(int i=0; i<max+1; i++){
            arr[i]=-1;
        }
        for(Pair i : list){
            int x = i.first;
            for(int j=x; j>=1; j--){
                if(arr[j]==-1){
                    arr[j]=x;
                    profit+=i.second;
                    break;
                }
            }
        }
        return profit;
    }
}
