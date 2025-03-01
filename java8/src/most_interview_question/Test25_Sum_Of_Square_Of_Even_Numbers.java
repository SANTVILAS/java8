package most_interview_question;

import java.util.Arrays;
import java.util.List;

public class Test25_Sum_Of_Square_Of_Even_Numbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Double result=list
		.stream()
		.filter(x->x%2==0)
		.map(y->Math.pow(y, 2))
		.reduce((double) 0,(x,y)->x+y);
		
		System.out.println(result);
	}
}
