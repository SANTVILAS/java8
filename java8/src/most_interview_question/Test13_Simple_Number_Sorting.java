package most_interview_question;

import java.util.Arrays;
import java.util.List;

public class Test13_Simple_Number_Sorting {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
		
		 list.stream().sorted().forEach(System.out::println);
		 
	}
}
