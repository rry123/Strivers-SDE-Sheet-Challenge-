import java.util.*;
public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        int ans[]= new int[n];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)->a-b);
        for(int i=0; i<n; i++){
            if(maxheap.isEmpty() || maxheap.peek()> arr[i]){
                maxheap.add(arr[i]);
            }
            else{
                minheap.add(arr[i]);
            }

            if(maxheap.size()> minheap.size()+1){
                minheap.add(maxheap.poll());
            }
            if(minheap.size()>maxheap.size()){
                maxheap.add(minheap.poll());
            }

            if(minheap.size()==maxheap.size()){
                int x = minheap.peek();
                int y = maxheap.peek();
                ans[i]= (x+y)/2;
            }
            else{
                ans[i]= maxheap.peek();
            }
        }
        return ans;
    }
}
