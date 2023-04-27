package Sorting;

import java.util.Arrays;

public class selectionsort {

	public static void ssort(int[] a) {
		int min,temp;
		int n = a.length;
		
		for(int i=0; i<n-1; i++) {
			min=i;
		    for(int j=i+1; j<n; j++) {
		    	if(a[j] < a[min]) {
		    		min = j;
		    	}
		    }
		    
		    temp = a[i];
		    a[i] = a[min];
		    a[min] = temp;
		    System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,4,2,3,6,5};
		ssort(a);
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
	}

}
