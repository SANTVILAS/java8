package most_interview_question;

import java.util.Arrays;
import java.util.List;

public class Test22_Sum_Square_Of_Even_Number {

	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sumOfSquaresOfEvenNumbers=numbers.stream()
		.filter(num->num%2==0)
		.mapToInt(num->num*num)
		.sum();
		
		System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvenNumbers);
	}
}
