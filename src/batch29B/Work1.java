package batch29B;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);//object is created
		System.out.println("enter the first number:" );
		a=s.nextInt();
		System.out.println("enter the second number:" );
		b=s.nextInt();
		
		System.out.println("a:"+a+" b:"+b);
		s.close();
		
	}

}
