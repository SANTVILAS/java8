package Test01_abc_Compay;

import java.util.Objects;

public class Person {

	private int voterId;
	
	private String personName;

	public Person(int voterId, String personName) {
		super();
		this.voterId = voterId;
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [voterId=" + voterId + ", personName=" + personName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(personName, voterId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(personName, other.personName) && voterId == other.voterId;
	}
	
	
	
	
}
