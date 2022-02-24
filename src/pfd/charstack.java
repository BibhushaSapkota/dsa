package pfd;

public class charstack {
    int top=-1;
    char stacks [];
    int size;

    charstack(int n){
        this.size=n;
        stacks=new char[n];
    }
    public void push(char data){
        if(isFull()) {
            System.out.println("stack overflow");
        }
        else
        {
            stacks[++top]=data;
        }
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return 'f';
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
    public char peek(){
        return stacks[top];
    }

}


