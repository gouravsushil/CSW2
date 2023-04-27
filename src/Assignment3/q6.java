package Assignment3;

import java.util.Arrays;

public class q6 {

	public static int swap(int[] a, int i, int j, int ctr) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return ctr++;
	}
	public static void main(String[] args) {
		int[] a = {8,9,6,4,3,2,1,7,0,5,3};
		int size = a.length;
		int i=0,j=size-1;
		int ctr=0;
		Arrays.sort(a);
		while(i<=j) {
			if(a[i]%2==0 && a[j]%2!=0) {   //even,odd
				ctr += swap(a,i,j,ctr);
				i++;
				j--;
			}
			else if(a[i]%2!=0 && a[j]%2==0) {  // odd,even
				i++;
				j--;
			}
			else if(a[i]%2==0 && a[j]%2==0) {  // even,even
				j--;
			}
			else  {  // odd,odd
				i++;
			}
		}
		
		for(int k:a) {
			System.out.print(k+" ");
		}
		System.out.println();
//		System.out.println("Number of swaps: " +ctr);
		
	}

}
