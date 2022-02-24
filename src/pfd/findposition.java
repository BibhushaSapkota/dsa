package pfd;

import java.util.Arrays;

public class findposition {
    public static void main(String[] args) {
        int[] x = {8, 4, 1, 1, 2, 2, 2};
        int target = 2;
        Arrays.sort(x);

        for (int i=0; i<x.length;i++){
            if (x[i]==target){
                System.out.println(i+1);
            }
        }
    }
}