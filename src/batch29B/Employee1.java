package batch29B;

public class Employee1 {
	private int emp_id;
	private String emp_name;
	private String emp_dep;
	public Employee1(int emp_id, String emp_name, String emp_dep) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dep = emp_dep;
	}

	public void set_emp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int get_emp_id() {
		return emp_id;
	}
	public void set_emp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String get_emp_name() {
		return emp_name;
	}
	public void set_emp_dep(String emp_dep) {
		this.emp_dep = emp_dep;
	}

	public String get_emp_dep() {
		return emp_dep;
	}


}
