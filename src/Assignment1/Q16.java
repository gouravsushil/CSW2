package Assignment1;

public class Q16 {

	public static void printArray(int[] a , int n) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void swap(int[] a , int i , int j) {
		int temp=a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void permutation(int[] arr , int i , int length) {
		if (length == i) {
			System.out.println();

			printArray(arr, length);
			return;
			}
			int j = i;
			for (j = i; j < length; j++) {
			swap(arr, i, j);
			permutation(arr, i + 1, length);
			swap(arr, i, j);
			}
			return;
	}
	public static void main(String[] args) {
		int[] a = {1,2,6,8,4};
		permutation(a,0,5);
		
	}

}
