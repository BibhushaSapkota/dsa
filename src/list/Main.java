package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("1","Bibhusha");
		Student s2= new Student("2","bisesh");
		Student s3=new Student("3","Saurav");
		
		
		List <Student>students= new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Department com=new Department("Computing",students);
		System.out.println("Total no of students in each department is"+com.count());
		
		for (Student s: students) {
			System.out.println(s.getFullname()+" your id is"+s.getId());
		}
		

	}

}
