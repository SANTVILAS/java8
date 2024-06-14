package Test01_abc_Compay;

import java.util.HashSet;

//selenium express hashSet==> 2 hour long video

public class App {

	public static void main(String[] args) {
		
		HashSet<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(10);
		integerSet.add(30);
		integerSet.add(20);
		integerSet.add(50);
		integerSet.add(40);
		
		System.out.println(integerSet);
		
		
		System.out.println("*************************************************");
		
		HashSet<Person> personHashSet = new HashSet<Person>();
		personHashSet.add(new Person(101, "sant"));
		personHashSet.add(new Person(102, "vilas"));
		personHashSet.add(new Person(103, "keshari"));
		personHashSet.add(new Person(101, "monu"));
		
		System.out.println(personHashSet.size());
		
		
		System.out.println(personHashSet);
		
	}
	
	
}
