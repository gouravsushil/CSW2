package Practice1;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

		int size = 8;
		int a[] = {2,5,3,7,9,1,8,6};
		Arrays.sort(a);
		// a = {1,2,3,5,6,7,8,9}
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]-1 != i) {
				System.out.println(a[i]-1);
				break;
			}
		}
		
	}

}
