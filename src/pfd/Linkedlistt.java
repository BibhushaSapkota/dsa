package pfd;

public class Linkedlistt {
    int size=0;
    public  static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
    Node tail=null;


    public void addNode(int data){
        size++;
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            /*Node current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newnode;*/


        }
    }
    public void PrintList(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void PrintListt(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public int getDataAtanyposition(int i){
        if(i<=size){
        Node current=head;
        for(int j =1;j<i;j++){
            current=current.next;
        }
        return current.data;
    }
       return -99999;
    }
    public int getSize(){
        return size;
    }
    public int remove(int i){
        if(i<=size){
            Node current=head;
            for(int j =1;j<i-1;j++){
                Node temp=current.next;
                current=current.next;
                temp.next=null;
            }
            current.next=current.next.next;
            size--;
        }
        return -99999;

    }
}
