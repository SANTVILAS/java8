package most_interview_question;

import java.util.stream.IntStream;

public class Test09_Sum_Of_Even_Number_From1_To_1000 {

	public static void main(String[] args) {
		
		Integer ansewr=IntStream.rangeClosed(1, 1000).filter(i->i%2==0).sum();
		
		System.out.println(ansewr);
		
	}
}
