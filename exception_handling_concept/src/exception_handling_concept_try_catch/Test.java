package exception_handling_concept_try_catch;

/*
 * public class Test { public static void main(String[] args) {
 * 
 * int arr[] = new int[5];
 * 
 * System.out.println("Hello Guys");
 * 
 * try { int result = 5 / 0; System.out.println(arr[8]);
 * 
 * } catch (ArrayIndexOutOfBoundsException e) {
 * System.out.println("Try to access out of bound element"); } catch
 * (ArithmeticException e) { System.out.println(e.getStackTrace());
 * System.out.println(e.getMessage()); System.out.println(e);
 * 
 * }
 * 
 * System.out.println("Bye guys");
 * 
 * } }
 */

public class Test {

	static int getNumberFromArray(int arr[]) throws ArithmeticException {

		return arr[8];
	}

	public static void main(String[] args)  {

		int arr[] = new int[5];
		
		try {
			getNumberFromArray(arr);
		} catch (Exception e) {
		System.out.println("catch the exception "+e.getMessage());
		}

		System.out.println("Hello Guys");

		try {
			int result = 5 / 0;
			System.out.println(arr[8]);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Try to access out of bound element");
		} catch (RuntimeException e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			System.out.println(e);

		}

		System.out.println("Bye guys");
	}

}
