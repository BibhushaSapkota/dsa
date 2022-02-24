package batch29B;
import java.util.Scanner;

public class Main_account {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char val;
		Account a1 =new Account( 1,"bibhu",5000);
		do {
		System.out.println("1.balance enquiry \n2.deposite\n3.withdraw");
		System.out.println("choose your option:");
		int opt=sc.nextInt();
		switch (opt) {
			case 1 : 
				a1.balance_enquiry();
				break;
			case 2:
				System.out.println("enter your amount for deposite");
				float dmat= sc.nextFloat();
				a1.deposit(opt);
				break;
			case 3:
				System.out.println("enter your withdraw amount");
				float wmat= sc.nextFloat();
				a1.withdraw(opt);
				break;
			default:
				System.out.println("invalid option");
				
			}
		System.out.println("do you want to continue?(y/n):");
		val=sc.next().charAt(0);
		} while (val=='y');
	}

}
