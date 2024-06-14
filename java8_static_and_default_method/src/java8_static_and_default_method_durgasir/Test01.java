package java8_static_and_default_method_durgasir;

interface I{
	
	default void m1() {
		
		System.out.println("Default method");
	}
}

public class Test01 implements I {
	@Override
	public void m1() {
		System.out.println("overriden version of default method");
	}
	
	
	public static void main(String[] args) {
		
		
		Test01 t = new Test01();
		t.m1();
		
	}
	
	
}
