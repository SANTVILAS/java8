package design_pattern_creational_singleton;

class A {

	private static A a = null;

	private A() {

	}

	public static A getRef() {
		if (a == null) {
			a = new A();
			return a;
		} else {
			return a;
		}

	}

}

public class Test {
	public static void main(String[] args) {
         System.out.println(A.getRef());
         System.out.println(A.getRef());
         System.out.println(A.getRef());
         
         
	}
}
