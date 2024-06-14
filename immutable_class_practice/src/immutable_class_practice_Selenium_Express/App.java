package immutable_class_practice_Selenium_Express;

public class App {

	public static void main(String[] args) {

		Address homeAddress = new Address("SDL", "MP","India");

		Student vilas = new Student(1, "vilas", homeAddress);

		System.out.println(vilas);
        
		Address address=vilas.getAddress();
		
		address.setCity("PUNE");
		address.setState("MH");
		System.out.println(vilas);
	}
}