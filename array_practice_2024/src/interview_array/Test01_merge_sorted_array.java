package interview_array;

/******************************************************************************

Given two sorted arrays, the task is to merge them in a sorted manner.

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 

*******************************************************************************/
import java.util.*;

public class Test01_merge_sorted_array {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int k = 0;

		int[] arr3 = new int[arr1.length + arr2.length];

		System.out.println();
		// { 1, 3, 4, 5}
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
        }
		
		while(i<arr1.length) {
			    arr3[k]=arr1[i];
			    i++;
			    k++;
		}
		
		while(j<arr2.length) {
			
			   arr3[k]=arr2[j];
			   j++;
			   k++;
		}

		return arr3;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7 };

		int arr2[] = { 2, 4, 6, 8 };

		int arr3[] = mergeArrays(arr1, arr2);

		System.out.println("Array after merging - " + Arrays.toString(arr3));
	}

}
