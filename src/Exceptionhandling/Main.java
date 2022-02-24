package Exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter the first value:");
			int first=sc.nextInt();
			System.out.println("Enter the second value:");
			int second=sc.nextInt();
			int result=first/second;
			System.out.println("The result is:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(InputMismatchException f) {
			System.out.println(f);
		}
		finally {
			System.out.println("I am Finally");
		}
		
				
	
	}
}
