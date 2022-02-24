package batch29B;

import java.util.Scanner;

public class Areacircle {

	public static void main(String[] args) {
		float pi=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		float radius=sc.nextInt();
		float area=pi*(radius*radius);
		System.out.println("the area of circle is:"+ area);
		float perimeter=2*pi*radius;
		System.out.println("the perimeter of circle is:"+ perimeter);
		sc.close(); 

	}

}
