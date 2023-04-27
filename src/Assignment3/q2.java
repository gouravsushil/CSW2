package Assignment3;

public class q2 {

	public static void main(String[] args) {
	    int[] a = {1,0,0,2,1,1,1,2,2,2,1,0};
	    int i=0,j=a.length-1;
		int zero=0,one=0,two=0;
		for(int l=0 ; l<a.length ; l++) {
			if(a[l] == 0) {
				zero++;
				a[l]=0;
			}
			else if(a[l] == 1) {
				one++;
				a[l]=0;
			}
			else {
				two++;
				a[l]=0;
			}
		}
		
		for(int k = zero+1 ; k<one+zero; k++) {
			a[k] = 1;
		}
		for(int m = one+zero; m<a.length; m++) {
			a[m] = 2;
		}
		
		 
		 for(int l:a) {
			 System.out.print(l+" ");
		 }
		 System.out.println();
//		 System.out.println("The number of swaps is " +ctr);
	}

}
