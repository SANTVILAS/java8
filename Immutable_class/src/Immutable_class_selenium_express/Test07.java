package Immutable_class_selenium_express;

public class Test07 {

//	
//	Input: s = "abcadbcbb"
//	         Output: 3   012 
//	 	
	
	
	

	public static int count_maxvalue(String str){
		
		
		
		for(int i=0;i<str.length();i++) {
			int max_count = 0;
			for(j=i;j<str.length();j++) {

				  if(str[i]!=str[i+1]) {
				        i++;
						max_count   = i;
						continue;
				  }
			}
		}
		
		
		
		
		
	for(int i=0;i<str.length;i++){
						  else{
							  break;
							  
						  }
						  
	}				  
	}
	public static void main(String[] args) {
		String str = "abcabcbb";
		count_maxvalue(str);
	//	String[] str = s.split("");
	}

}
}
