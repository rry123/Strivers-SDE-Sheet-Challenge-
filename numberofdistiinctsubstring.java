import java.util.* ;
import java.io.*; 
class Node{
    Node links[]= new Node[26];
    
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    Node get(char ch){
        return links[ch-'a'];
    }
    
    void put(char  ch , Node node){
        links[ch-'a']= node;
    }
}
public class Solution {
    public static int distinctSubstring(String word) {
        // Write your code here.
        int count = 0;
        Node root = new Node();
        for(int i=0; i<word.length(); i++){
            Node node = root;
            for(int j=i; j<word.length(); j++){
                if(!node.containsKey(word.charAt(j))){
                    node.put(word.charAt(j), new Node());
                    count++;
                }
                node = node.get(word.charAt(j));
            }
        }
        return count;
    }
}
