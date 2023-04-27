package Assignment1;

public class Q10 {

	public static int[] maxminArr(int[] a) {
		int n = a.length;
		int[] aux = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			aux[i] = a[i];
		}
		
		int start = 0 , end = n-1;
		for(int i=0 ; i<n ; i++) {
			if(i%2 == 0) {
				a[i] = aux[end]; 
				end = end-1;
			}
			else {
				a[i] = aux[start];
				start = start+1;
			}
		}

		return a;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		a = maxminArr(a);
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
