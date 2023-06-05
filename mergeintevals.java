import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

class mycompare implements Comparator<Interval>{
    public int compare(Interval a, Interval b){
        if(a.start<=b.start){
            return -1;
        }
        else{
            return 1;
        }
    }
}
public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals, new mycompare());
        // for(Interval i : intervals){
        //     System.out.println(i.start+" "+i.finish);
        // }
        int st = intervals[0].start;
        int en = intervals[0].finish;
        List<Interval> list = new ArrayList<>();
        for(Interval i : intervals){
            if(i.start<=en){
                en = Math.max(en, i.finish);
            }
            else{
                list.add(new Interval(st, en));
                st = i.start;
                en = i.finish;
            }
        }
        list.add(new Interval(st, en));
        return list;
    }
}
