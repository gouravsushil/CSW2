package Array;

public class maxMinArray {

	public static void main(String[] args) {

		// first solution 
		int[] a = {1,2,3,4,5,6,7};
		
		int[] b = new int[a.length];
		for(int i=0 ; i<a.length ; i++) {
			b[i] = a[i];
		}
		int start=0;
		int stop = a.length-1;
		for(int j=0 ; j<a.length ; j++) {
			if(j%2 == 0) {
				a[j] = b[stop];
				stop -= 1;
			}
			else {
				a[j] = b[start];
				start += 1;
			}
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
