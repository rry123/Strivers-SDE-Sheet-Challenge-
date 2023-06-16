import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static boolean check(Map<Integer, Set<Integer>> map , int src, int color[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src]=0;
        while(!q.isEmpty()){
            int alpha = q.poll();
            int x = color[alpha];
            for(int it : map.get(alpha)){
                 if(color[it]==-1){
                     color[it]= 1- x;
                     q.add(it);
                 }
                 else if(color[it]==x){
                     return false;
                 }
            }
        }
        return true;
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int n = edges.size();
        int m = edges.get(0).size();
        for(int i=0; i<n; i++){
            map.put(i, new HashSet<>());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(edges.get(i).get(j)==1){
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        int color[]= new int[n];
        for(int i=0; i<n; i++){
            color[i]=-1;
        }
        return check(map, 0, color);
    }
}