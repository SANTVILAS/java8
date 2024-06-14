package design_pattern_creational_factory;

class A{
	
	private A() {
		System.out.println("Private Constructor");
	}
	
	public static A getRef() {
		
		A a = new A();
		return a;
	}
	
	public void m1() {
		System.out.println("M1 method executed");
	}
	
	
	
	
}

public class Test {
public static void main(String[] args) {
	
	A obj=A.getRef();
	obj.m1();
}
}
