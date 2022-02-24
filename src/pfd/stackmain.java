package pfd;

public class stackmain {
    public static void main(String[] args){
        stackclass1 stk=new stackclass1(6);
        stk.push(10);
        stk.push(30);
        stk.push(40);
        System.out.println(stk.pop());
        stk.push(20);
        stk.push(50);
        stk.push(60);
        System.out.println(stk.pop());



    }
}
