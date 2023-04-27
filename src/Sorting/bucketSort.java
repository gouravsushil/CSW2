package Sorting;

public class bucketSort {

	public static void bSort(int[] a, int lower, int higher) {
		int n = a.length;
		int range = higher-lower;
		int[] count = new int[range];
		int i;
		for (i = 0; i < n; i++) {
		count[a[i] - lower]++;
		}
		
		int j=0;
		for (i = 0; i < range; i++) {
			for (; count[i] > 0; (count[i])--) {
			a[j++] = i + lower;
			}
		}
		
	}
	public static void main(String[] args) {

		int[] array = {23,24,22,21,26,25,27,28,21,21};
		bSort(array,20,30);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}

}
