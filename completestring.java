import java.util.* ;
import java.io.*; 

class Node{
  Node links[]= new Node[26];
  boolean flag = false;
  

  boolean containsKey(char ch){
    return (links[ch-'a']!=null);
  }

  Node get(char ch){
    return links[ch-'a'];
  }
   void put(char ch, Node node){
     links[ch-'a']= node;
   }

   void setEnd(){
     flag = true;
   }

   boolean isend(){
     return flag;
   }
}

class trie{
  static  Node root;
  trie(){
    root = new Node();
  }
  public static void insert(String word){
    Node node = root;
    for(int i=0; i<word.length(); i++){
      if(!node.containsKey(word.charAt(i))){
        node.put(word.charAt(i), new Node());
        
      }
      node = node.get(word.charAt(i));
    }
    node.setEnd();
  }
  
   public static boolean check(String word){
     boolean ans = true;
     Node node = root;
     for(int i=0; i<word.length(); i++){
       if(node.containsKey(word.charAt(i))){
         node = node.get(word.charAt(i));
         ans = ans & node.isend();
       }
       else{
         return false;
       }
     }
     return ans;
   }
}
class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.

     trie myt = new trie();
     for(int i=0; i<n; i++){
       trie.insert(a[i]);
     }
     
     String longest = "";
     for(String it : a){
       if(trie.check(it)){
         if(it.length()>longest.length()){
           longest = it;
         }
         else if(it.length()== longest.length() && it.compareTo(longest)<0){
           longest = it;
         }
       }
     }
     if(longest.length()!=0)
     return longest;
     else
     return "None";

  }
}