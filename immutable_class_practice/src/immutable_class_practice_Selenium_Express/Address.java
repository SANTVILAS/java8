package immutable_class_practice_Selenium_Express;

public class Address {

	private String city;
	private String state;
	private String country;

	public Address(String city, String state,String country) {
		super();
		this.city = city;
		this.state = state;
		this.country=country;
	}
	
	public Address(Address address) {
	this(address.getCity(), address.getCountry(), address.getState());
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	
	static Address getInstance(Address address) {
		return new Address(address.getCity(),address.getState(),address.getCountry());
	}


}
