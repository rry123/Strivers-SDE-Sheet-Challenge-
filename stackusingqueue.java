import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.
   

    Queue<Integer> q1;
         Queue<Integer> q2;
    public Stack() {
        // Implement the Constructor.
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
         
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        if(q1.isEmpty()){
            return true;
        }
        return false;
    }

    public void push(int element) {
        // Implement the push(element) function.
        q2.add(element);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp = new LinkedList<>(q1);
        q1= q2;
        q2= temp;
    }

    public int pop() {
        // Implement the pop() function.
        if(!q1.isEmpty()){
            return q1.remove();
        }
        return -1;
    }

    public int top() {
        // Implement the top() function.
        if(!q1.isEmpty()){
            return q1.peek();
        }
        return -1;
    }
}