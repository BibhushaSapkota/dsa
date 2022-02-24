package batch29B;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if (i%2==1) {
				sum=sum+i;

			}
		}
		System.out.println("sum of odd numbers upto 100 is "+ sum);
		sc.close();
	}
}