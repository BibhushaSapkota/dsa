package pfd;

public class primenumber3 {
    public static void main(String[] args) {
        int i, n = 9;
        int r= (int) Math.sqrt(n);
        boolean m = true;
        for (i = 2; i < r; i++) {
            if (n % i == 0) {
                m=false;
                break;
            }
        }

        if (m==true) {
            System.out.println(n +" is a prime number");
        }
        else{
            System.out.println(n +" is not a prime number");
        }
    }
}
