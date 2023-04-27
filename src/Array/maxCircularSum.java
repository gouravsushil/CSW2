package Array;

public class maxCircularSum {

	public static void main(String[] args) {
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		int size = arr.length;
		int sumAll = 0;
		int currVal = 0;
		int maxVal;
		for(int i = 0; i< size ; i++){
		sumAll += arr[i];
		currVal += (i+1*arr[i]);
		}
		maxVal = currVal;
		for(int i= 1; i< size; i++){
		currVal = ( currVal + sumAll ) - ( size * arr[size-i] );
		if (currVal > maxVal){
		maxVal = currVal;
		 }
	    }
		System.out.println(maxVal);

	}

}
