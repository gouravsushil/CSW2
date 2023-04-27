package Assignment1;

public class Q6 {

	public static void main(String[] args) {
		int[] a = {3,2,2,-2,-5,8};
		int n = a.length;
		int maxSum=0 , currSum=0;
		for(int i=0 ; i<n ; i++) {
			currSum += a[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		System.out.println(maxSum);
	}

}
