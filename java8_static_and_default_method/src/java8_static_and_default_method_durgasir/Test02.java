package java8_static_and_default_method_durgasir;


interface interf{
	
	public static void sum(int a, int b) {
		System.out.println("The sum "+(a+b));
	}
}

public class Test02 implements interf{
 public static void main(String[] args) {
   
	 Test02 t = new Test02();
//CE	  t.sum(10,20);

// It says bydefault static method not present here	 Test02.sum(10,30);
	 
	 interf.sum(10, 30);
	 
	}
}
