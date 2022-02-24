package batch29B;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of base:");
		int base=sc.nextInt();
		System.out.println("enter the length of height:");
		int height=sc.nextInt();
		int area=(base*height)/2;
		System.out.println("the area of triangle is:"+ area);
		sc.close();

	}

}
