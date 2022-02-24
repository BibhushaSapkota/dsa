package pfd;

public class LRUmain {
    public static void main(String[] args){
        LRUCaching c=new LRUCaching(4);
        c.put(1,100);
        c.put(2,200);
        c.put(3,300);
        c.put(4,400);
        System.out.println(c.get(4));

    }

}
