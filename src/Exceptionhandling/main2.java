package Exceptionhandling;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int value=sc.nextInt();
		if(value<0) {
			throw new ArithmeticException();
		}
		

	}

}
