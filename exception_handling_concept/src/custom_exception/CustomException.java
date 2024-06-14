package custom_exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args)  {
	
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		
		try {
			if(age >100) {
				throw new MyException("Age greater than 100");
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}

class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
	
	
}
