import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void dfs(Map<Integer, ArrayList<Integer>> map, Stack<Integer> st, int node, int vis[]){
         vis[node]=1;
         for(int it : map.get(node)){
             if(vis[it]==0){
                 dfs(map, st, it, vis);
             }
         }
         st.push(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<v; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i=0; i<e; i++){
            map.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        Stack<Integer> st = new Stack<>();
        int vis[]= new int[v];
        for(int i=0; i<v; i++){
            if(vis[i]==0){
                dfs(map, st, i, vis);
            }
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}
