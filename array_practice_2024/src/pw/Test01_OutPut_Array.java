package pw;

import java.util.Scanner;

public class Test01_OutPut_Array {

	public static void main(String[] args) {

	//	int arr[] = new int[7];
//
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

	
		
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);	
//		}
		
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[7];
	    
	    for(int i=0;i<=6;i++) {
	    	arr[i]=sc.nextInt();
	    }
		
	    
	    for(int i=0;i<=6;i++) {
	    	System.out.println(arr[i]+" ");
	    }
	    
	   
		
		
		
	}

}
