package Practice1;

public class Q1 {

//	static int n = 11;
//	static int k = 3;
//	static int[] a = {11,5,3,4,8,9,1,6,2,7,10};
	
	static int n = 8;
	static int k = 3;
	static int[] a = {0,1,2,3,4,5,6,7};
	
	
//	static int[] b = new int[k];
	public static void reverse(int i , int j) {
		int temp = 0;
		while(i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {

		
		for(int i=0 ; i<n ; i = k+i) {
			if(k+i < n) {
				reverse(i , k+i-1);
			}
			else {
				reverse(i , n-1);
			}
		}
		
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
