package Immutable_class_selenium_express;

public class App {

	public static void main(String[] args) {
		Address homeAddress = new Address("bbsr", "orisha","India");
		Student abhilash = new Student(1, "abhilash", homeAddress);

		System.out.println(abhilash);
		
		Address address=abhilash.getAddress();
		address.setCity("shahdol");
		address.setState("M.P");
		
		System.out.println(abhilash);
	}
}
