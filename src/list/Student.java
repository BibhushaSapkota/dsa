package list;

public class Student {
	String id;
	String fullname;

public Student(String id, String fullname) {
	super();
	this.id = id;
	this.fullname = fullname;
	}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

}