package batch29B;

public class Account {
	int acc_num;
	String acc_name;
	double balance;
	
	public Account(int acc_num, String acc_name, double balance) {
		this.acc_num = acc_num;
		this.acc_name = acc_name;
		this.balance = balance;
	}

	public void balance_enquiry() {
		System.out.println("your balance:"+ balance);
	}
	public void deposit(float amount) {
		balance=balance+amount;
		System.out.println(amount+"has been deposited");
	}
	public void withdraw(float amount) {
		balance= balance-amount;
		System.out.println(amount+"has been withdrawn");
	}

}
