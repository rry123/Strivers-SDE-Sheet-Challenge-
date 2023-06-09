import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/



class mycompare implements Comparator<Pair>{
	public int compare(Pair a, Pair b){
		double x = (double)a.value/(double)a.weight;
		double y = (double)b.value/(double)b.weight;
		if(x>y){
			return -1;
		}
		else if(x<y){
			return 1;
		}
		else{
			return 0;
		}
	}
}
public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
			Arrays.sort(items, new mycompare());
			// for(Pair it : list){
			// 	System.out.println(it.weight+" "+it.value+" "+(long)it.weight/(long)it.value);
			// }
			double ans =0;
			int i=0;
			for(Pair it : items){
				if(w>=it.weight){
					ans+=it.value;
					w = w-it.weight;
				}
				else{
					ans+= w*((double)(it.value)/(double)(it.weight));
					w =0;
					//break;
				}
			}
			return ans;
    }
}
