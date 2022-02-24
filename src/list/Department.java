package list;

import java.util.List;

public class Department {

	String name;
	List<Student> students;
	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int count() {
		int noofstudents=0;
		for (Student s:students) {
			noofstudents++;
			}
		return noofstudents;
	}

}
