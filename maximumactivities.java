import java.util.*;
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
            return a.second-b.second;
        }
        else{
           return a.first-b.first;
        }
    }
}
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        List<Pair> list = new ArrayList<>();
        int n = start.size();
        for(int i=0; i<n; i++){
            list.add(new Pair(start.get(i), end.get(i)));
        }
        
        Collections.sort(list, new mycompare());
        // for(Pair it : list){
        //     System.out.println(it.first+" "+it.second);
        // }
        int prev=list.get(0).second;
        int count=1;
        for(int i=1; i<list.size(); i++){
            if(list.get(i).first>=prev){
                count++;
                prev = list.get(i).second;
            }
        }
        return count;
    }
}

// 1 2 4 6 
// 2 5 8 7



