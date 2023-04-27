package Array;

public class maxsubArray {

	public static void main(String[] args) {
		int[] a = {1,-2,3,4,-4,6,-10,3,2,5,7,-18};
		int sum=0 , tempSum=0 , temp=0;
		for(int i=0 ; i<a.length ; i++) {
			tempSum = tempSum+a[i];
			if(tempSum < 0) {
				tempSum=0;
				temp = i;
			}
			if(sum < tempSum) {
				sum = tempSum;
				
			}
			
			
		}
		System.out.println(sum);
		for(int j=temp+1 ; j<a.length ; j++) {
			System.out.print(a[j]+" ");
		}

	}

}
