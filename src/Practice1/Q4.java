package Practice1;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
	   int a[] = {0,1,2,3,4,5,6,7};
	   Arrays.sort(a);
	   for(int i=1 ; i<a.length-1 ; i=i+2) {
		   int temp = a[i];
		   a[i] = a[i+1];
		   a[i+1] = temp;
	   }
	   System.out.println(Arrays.toString(a));
	}

}
