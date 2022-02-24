package pfd;
//important
import java.util.HashMap;

public class LRUCaching {
    int capacity;
    HashMap<Integer,Node> map;
    LRUCaching(int capacity){
        this.capacity=capacity;
        map=new HashMap<>();
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            //remove element from map and linked list
            //insert element
            //update
            Node node= map.get(key);
            remove(node);
            insert(node);

        }
        else if(map.size()==capacity){
            remove(tail);
        }
        else {
            Node newnode = new Node(key, value);
            insert(newnode);
        }
    }
    public int get(int key){
     Node node= map.get(key);
     if(node==null){
         return -1;
     }
     else {
         remove(node);
         insert(node);
         return node.value;
     }
    }

    Node head=null;
    Node tail=null;
    public void insert(Node newnode){
        map.put(newnode.key, newnode);
        if (head==null){
            head=tail=newnode;
        }
        else{
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    public void remove(Node node){
        map.remove(node.key);
        if(node==tail){
            tail.prev.next=null;
            tail=tail.prev;
            node.prev=null;

        }
        else if(node==head){
            head=head.next;
            node.next=null;
            head.prev=null;
        }
        else if(node==head && head==tail){
            head=tail=null;
        }
        else {
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.prev=null;
            node.next=null;
        }
    }


    public static class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }

    }
}
