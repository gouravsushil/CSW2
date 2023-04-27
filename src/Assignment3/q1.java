package Assignment3;

public class q1 {

	public static void main(String[] args) {
//		 int[] a = {1,0,0,0,1,0,1,0,1,0,1,1};
//		 int[] a = {0,0,0,0,0,0,1,1,1,1,1};
//		 int[] a = {1,0,1};
		 int[] a = {1,0,0,0,1,1,0,1,1,0};
		 int i=0,j=a.length-1;
		 int ctr=0;
		 while(i<=j) {
			 if(a[i]==1 && a[j]==1) {
				 j--;
			 }
			 else if(a[i]==1 && a[j]==0) {
				 int temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
				 ctr++;
			 }
			 else if(a[i]==0 && a[j]==0){
				 i++;
			 }
			 else {
				 i++;
				 j--;
			 }
		 }
		 for(int l:a) {
			 System.out.print(l+" ");
		 }
		 System.out.println();
		 System.out.println("The number of swaps is " +ctr);
		 
	}

}
