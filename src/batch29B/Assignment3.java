package batch29B;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sum =0;
		for(int i=1; i<=100;i++) {
			sum=sum+i;
			
		}
		System.out.println("sum of natural numbers upto 100 is "+sum);
		 sc.close();
	}
	  
}
