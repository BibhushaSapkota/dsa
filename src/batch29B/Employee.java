package batch29B;

public class Employee {
	int id;
	String name;
	String add;

	public Employee(int id, String name, String add) {
	
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("address:"+add);
	}
}
