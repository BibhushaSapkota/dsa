package batch29B;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a character:");
		char userinput = sc.next().charAt(0);
		
		while (userinput!='q') {
			System.out.println("enter again:");
			userinput=sc.next().charAt(0);
			}
			System.out.println("program ends");
		   }
		
		}

