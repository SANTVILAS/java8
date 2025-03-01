package most_interview_question;

import java.util.Arrays;
import java.util.Comparator;

public class Test03_Second_Highest_Number {

	public static int secondLargest(int arr[]) {
		int L=Integer.MIN_VALUE;
		int sL=Integer.MIN_VALUE;
		
		if (arr.length == 0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>L) {
				sL=L;
				L=arr[i];
				
			}if(arr[i]<L && arr[i]>sL) {
				sL=arr[i];
				
			}
		}
		return sL;
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 6, 1, 3, 8, 7 };
		int ans = secondLargest(arr);
		System.out.println(ans);
		
		Integer secHighest=Arrays.stream(arr)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println("Second highest no through java8 "+secHighest);
		
	}
	
}
