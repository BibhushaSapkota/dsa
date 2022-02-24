package pfd;



public class doubleclickLinkedList {
    int size;
    Node prev;
    Node next;
    public static class Node {
        Node prev;
        Node next;
        int data;


    Node(int data) {
        this.prev = null;
        this.next=null;
        this.data=data;
    }
}
    Node head=null;
    Node tail=null;
    public void addNode(int data){
        Node newnode=new Node(data);

        if (head==null){
            head=tail=newnode;

        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

    public void PrintList(){
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
    public int remove(int i){
        if(i<=size){
            Node current=head;
            for(int j =1;j<i-1;j++){
                prev.next=current.next;
                next.prev=current.prev;
                current=current.next;
            }
            current.next=current.next.next;
        }
        return -99999;

    }
}

