package batch29B;
import java.util.Scanner;
public class Main_Employee1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Employee1 a= new Employee1(1001,"bibhu","designing");
	System.out.println("starting values:"+a.get_emp_id());
	a.set_emp_id(1002);
	System.out.println("after updating:"+a.get_emp_id());
	sc.close();
	}

}
