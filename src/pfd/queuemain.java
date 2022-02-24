package pfd;


public class queuemain {
    public static void main(String[] args){
            circularQueue q=new circularQueue(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);

            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            q.enqueue(60);
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            q.enqueue(70);
            q.enqueue(80);
            System.out.println(q.dequeue());
    }
}
