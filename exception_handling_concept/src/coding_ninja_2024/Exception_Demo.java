package coding_ninja_2024;
//by manisha ma'am
public class Exception_Demo {

	public static  int fact(int n) throws NegativeNumberException {
	
		if(n<0) {
			System.out.println("Hi");
			throw new NegativeNumberException();
			
		}
		
		int ans=1;
		for(int i=2;i<=n;i++) {
			ans = ans * i;
		}
		return ans;
	}
	
	public static int divideByZero(int a , int b) throws DivideByZeroException {
		if(b==0) {
		System.out.println("Dont enter 0 in deno");
		throw new DivideByZeroException();
		}

		return a/b;
	}
	
	
	public static void main(String[] args)   {
		
		
		try {
			System.out.println(Exception_Demo.fact(9));
			System.out.println(divideByZero(5,5));
			System.out.println("Hey");
		} catch (DivideByZeroException e) {
			System.out.println("Divide by zero exception raised");
			//e.printStackTrace();
		}catch (NegativeNumberException e) {
			System.out.println("Negative no exception");
		}catch(Exception e){
			System.out.println("Generic Exception");
		}
		
		System.out.println("Main");
	}
	
}
