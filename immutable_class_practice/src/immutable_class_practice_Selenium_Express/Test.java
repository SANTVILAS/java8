package immutable_class_practice_Selenium_Express;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//o/p ===>Developer ,Develope2

public class Test {
	
	private static int maxWord(String[] str1) {
		//I need to return largest word
		int max =-1;
		
		for(int i=0;i<str1.length;i++) {
			
		if(str1.length>max)	
			 max=str1.length;
		}
		return max;
	}
	

	public static void main(String[] args) {
		String str = "I am Java Developer Develope2";
		
		
		String[] str1 = str.split(" ");
		int max1=maxWord(str1);
		List<String> mapAns=Arrays.asList(str1).stream().filter(word->word.length()>max1).collect(Collectors.toList());
		
		
	//	mapAns.forEach((key,value)->System.out:print);
		
		System.out.println(mapAns);
		
		
		
	}


	
	
}
