package pfd;


class downloadIMG implements Runnable{



    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("@downloading image: image"+i+".jpg");
        }
    }

}




public class MultiThreadApp1 {

    public static void main(String [] args) {

        System.out.println("app start");

        Runnable r=new downloadIMG();
// d.start();
        Thread mythread=new Thread(r);
        mythread.start();


        for(int i=1;i<=10;i++) {

            System.out.println("#downloading image: image"+i+".jpg");
        }

        System.out.println("app stop");
    }



}