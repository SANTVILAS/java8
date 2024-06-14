package custom_exception;

public class EcxeptionDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("My channel name is Selenium express");
			int c =10/0;//
			System.out.println("result hey "+c);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("don't put zero on denominator");
		}
		
		finally {
			System.out.println("I am finally block");
		}
		
		System.out.println("Byee every one");
		
	}
	
}
