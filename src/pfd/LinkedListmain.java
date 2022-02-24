package pfd;

public class LinkedListmain {
    public static void main(String[] args){
    Linkedlistt list=new Linkedlistt();
    list.addNode(10);
    list.addNode(20);
    list.addNode(30);
    list.addNode(40);
    list.PrintList();
    System.out.println("data at given position:");
    System.out.println(list.getDataAtanyposition(3));
    list.remove(2);
    System.out.println("after removing node:");
    list.PrintList();
    }
}
