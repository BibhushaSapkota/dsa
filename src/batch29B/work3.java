package batch29B;
import java.util.Scanner;


public class work3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the weekday value:(1-7)");
		int day= sc.nextInt();
		switch(day)
		{
		case 1:System.out.println("this is sunday");
		break;
		case 2:System.out.println("this is monday");
		break;
		case 3:System.out.println("this is tuesday");
		break;
		case 4:System.out.println("this is wednesday");
		break;
		case 5:System.out.println("this is thursday");
		break;
		case 6:System.out.println("this is friday");
		break;
		case 7:System.out.println("this is saturday");
		break;
		default : System.out.println("invalid digit");
		}

	}

}
