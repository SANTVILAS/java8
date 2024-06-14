package immutable_class_practice_Selenium_Express;

public class Student {

	final private int id;
	final private String StudentName;
	final private Address address;
	
	
	public Student(int id, String studentName, Address address) {
		super();
		this.id = id;
		StudentName = studentName;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public String getStudentName() {
		return StudentName;
	}


	public Address getAddress() {
		//return new Address(address.getCity(), address.getState(),address.getCountry());//deeep cloning
		
		//now we are doing above thing by coping constructor
	//	return new Address(address);
		
		//by getIntance method
		
		return Address.getInstance(address);
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", address=" + address + "]";
	}



}
