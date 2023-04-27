package Assignment1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
        int[] a = {1,4,9,15,20,26,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int n = sc.nextInt();
        int start=0,last=a.length-1;
        
        while(start <= last) {
        	int mid = (start+last)/2;
        	if(n == a[mid]) {
        		System.out.println("The required element is present at index " + mid);
        		break;
        	}
        	else if(n<a[mid]) {
        		last = mid-1;
        	}
        	else {
        		start = mid+1;
        	}
        }
        sc.close();
	}

}
