package batch29B;
import java.util.Scanner;
public class Main_account1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Account1 a= new Account1(1001,"bibhu",3000);
	System.out.println("starting values:"+a.get_acc_num());
	a.set_acc_num(1002);
	System.out.println("after updating:"+a.get_acc_num());
	sc.close();
	}

}