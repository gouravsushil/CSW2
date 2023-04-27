package Sorting;

public class insertionsort {
	
	public static void isort(int[] a) {
		int n = a.length;
		int j;
		for(int i=0; i<n; i++) {
			j=i;
			while(j>0 && a[j]<a[j-1]) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {9,1,8,2,7,3,6,4,5};
		isort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}
}
