package interview_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	int id;
	String firstName;
	String LastName;
	String fatherName;
	String status ="PENDING";
	
	
	public String getStatus() {
		return status;
	}

	public Student(int id, String firstName, String lastName, String fatherName, String status) {
	super();
	this.id = id;
	this.firstName = firstName;
	LastName = lastName;
	this.fatherName = fatherName;
	this.status = status;
}
	
	public int getId() {
		return id;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Student(int id, String firstName, String lastName, String fatherName) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", fatherName="
				+ fatherName + ", status=" + status + "]";
	}

	
	
}





public class Test05 {

	//pendign fee from last year
	
     public static void main(String[] args) {
		
    	 List<Student> list = new ArrayList<Student>(); 
	
    	 Student s1 = new Student(1, "sant", "vilas", "PENDING");
    	 Student s2 = new Student(2, "sant", "vilas", "PENDING"); 
    	 Student s3 = new Student(3, "sant", "vilas", "PENDING");
    	 
    	 
    
    	 
    	 
    	 List<Student> list1=list.stream().filter(student->student.getStatus().equals("PENDING")).collect(Collectors.toList());
    	
    	 System.out.println(list1);
    	 
	}

	
}
