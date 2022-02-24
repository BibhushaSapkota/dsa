package batch29B;

public class Account1 {
	int acc_num;
	String acc_name;
	double balance;
	public Account1(int acc_num, String acc_name, double balance) {
		super();
		this.acc_num = acc_num;
		this.acc_name = acc_name;
		this.balance = balance;
	}
	public void set_acc_num(int acc_num) {
		this.acc_num=acc_num;
		
	}
	public int get_acc_num() {
		return acc_num;
	}

}
