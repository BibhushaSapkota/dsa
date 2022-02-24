package pfd;

public class primenumber1 {
    public static void main(String[] args) {
        int i, n = 29;
        boolean m = true;
        for (i = 2; i < n; i++) {
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
        };
    }
    }
