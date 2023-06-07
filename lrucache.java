import java.util.*;
class Node{
    Node next;
    Node prev;
    int key;
    int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LRUCache
{
     Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    LRUCache(int capacity)
    {
        // Write your code here
         this.capacity = capacity;
         head.next = tail;
         tail.prev = head;
    }

    public int get(int key)
    {
        // Write your code here
         if(map.containsKey(key)){
             Node alpha = map.get(key);
             remove(alpha);
             insert(alpha);
             return alpha.value;
         }
         else{
             return -1;
         }
    }

    public void put(int key, int value)
    {
        // Write your code here
           if(map.containsKey(key)){
             remove(map.get(key));
         }
         if(map.size()==capacity){
             remove(tail.prev);
         }
         insert(new Node(key, value));
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node){
        map.put(node.key, node);
        Node headnext = head.next;
        head.next = node;
        node.prev = head;
        headnext.prev = node;
        node.next = headnext;
    }
}
 
