package pfd;

public class stackclass1 {
    int top=-1;
    int stacks [];
    int size;

    stackclass1(int n){
        this.size=n;
        stacks=new int[n];
    }
    public void push(int data){
        if(isFull()) {
           System.out.println("stack overflow");
        }
        else
        {
            stacks[++top]=data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -999999;
        }
        else
        {

            return stacks[top--];
        }
    }

    public boolean isFull(){
     if(top==size-1){
         return true;
     }
     return false;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

}
