package Practice1;
import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		int n=6;
		int[] a = {5,3,4,9,2,9};
		int[] b = {5,3,2,9,4,9};
		Arrays.sort(a);
		Arrays.sort(b);
		int ctr1=0 , ctr2=0;
		for(int i=0 ; i<n ; i++) {
			if(a[i] == b[i]) {
				ctr1++;
			}
//			else {
//				System.out.println("The two arrays are not equal");
//				break;
//			}
		}
		if(ctr1 != n) {
			System.out.println("The two arrays are not equal");
		}
		else {
			System.out.println("The two arrays are equal");
		}
	}

}
