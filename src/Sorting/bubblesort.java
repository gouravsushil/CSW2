package Sorting;

public class bubblesort {

	public static void bSort(int[] a) {
		int n = a.length;
		int ctr=0;
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=0 ; j<n-1-i ; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					ctr++;
				}
				
			}
			if(ctr == 0) {
				System.out.println("The array is already sorted");
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {9,1,8,2,7,3,6,4,5};
		bSort(a);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
