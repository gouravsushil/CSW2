package Sorting;

public class mergesort {

	public static void mrgSort(int[] a, int[] tempA, int i, int j) {
		if(i >= j) {
			return;
		}
		int k = (i+j)/2;
		mrgSort(a,tempA,i,k);
		mrgSort(a,tempA,k+1,j);
		int x=0;
		int id1 = i;
		int id2 = k+1;
		while(id1 <= k && id2 <= j) {
			if(a[id1] <= a[id2]) {
				tempA[x++] = a[id1++];
			}
			else {
				tempA[x++] = a[id2++];
			}
		}
		
		while(id1<= k) {
			tempA[x++] = a[id1++];
		}
		
		while(id1<=j) {
			tempA[x++] = a[id2++];
		}
		
		for(int u=0,v=j; u<tempA.length; u++,v++) {
			a[v] = tempA[u];
		}
	}
	public static void sort(int[] a) {
		int n = a.length;
		int[] tempA = new int[n];
		mrgSort(a,tempA,0,n-1);
	}
	public static void main(String[] args) {
		int[] a = {3,4,2,1,6,5,7,8};
		sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
