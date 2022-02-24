package pfd;

public class QueueTest {
    int front;
    int rear;
    int size;
    int queue[];

    QueueTest(int n){
        this.front=-1;
        this.rear=-1;
        this.size=n;
        queue=new int[n];
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("queue overflow");
        }
        else {
            if (isEmpty()) {
                front++;
            }
            queue[++rear]=data;
        }
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("queue is underflow");
            return -99999;
        }
        else{
            int element=queue[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }
            else {
                front++;
            }
            return element;
        }

    }
    public boolean isFull(){
        return rear==size-1;
    }
    public boolean isEmpty(){
        return  front==-1;
    }

}
