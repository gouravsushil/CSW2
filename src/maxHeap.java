
public class maxHeap {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void heapify(int[] a, int i, int n) {
	    int left = 2*i <=n ? a[2*i-1] : -1;
	    int right = 2*i+1 <=n ? a[2*i] : -1;
	    if(left < right && a[i-1]<right) {
	    	swap(a, i-1, 2*1);
	    	if(2*i+1<=a.length/2)
	    		heapify(a,2*i+1,n);
	    }
	    else if(left > right && a[i-1]<left) {
	    	swap(a, i-1, 2*i-1);
	    	if(2*i<=a.length/2)
	    		heapify(a,2*i,n);
	    }
	}
	
	public static void buildMaxHeap(int[] a, int n) {
		for(int i=n/2; i>=1; i--) {
			heapify(a,i,n);
		}
	}
	
	public static int deleteInMaxHeap(int[] a, int n) {
		swap(a, 0, n-1);
		buildMaxHeap(a,n-1);
		return n-1;
	}
	
	public static int heapSort(int[] a, int n) {
		while(n > 1) {
			n = deleteInMaxHeap(a,n);
		}
		return 1;
	}
	public static void main(String[] args) {
		int[] a = {15,30,8,10,13,50,20,60};
		int n = a.length;
		buildMaxHeap(a,n);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
//		n = deleteInMaxHeap(a,n);
//		System.out.println();
//		
//		for(int i=0; i<n; i++) {
//			System.out.print(a[i]+" ");
//		}
		System.out.println();
	    n = heapSort(a,n);
	    for(int i:a) {
	    	System.out.print(i+" ");
	    }
		
		
	}

}
