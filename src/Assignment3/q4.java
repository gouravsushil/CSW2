package Assignment3;

public class q4 {

	public static int minSwap(int[] arr, int n, int k) {
		int count = 0;
	    for (int i = 0; i < n; ++i)
	    if (arr[i] <= k)
	        ++count;
	 
	    // Find unwanted elements in current
	    // window of size 'count'
	    int bad = 0;
	    for (int i = 0; i < count; ++i)
	    if (arr[i] > k)
	        ++bad;
	 
	    // Initialize answer with 'bad' value of
	    // current window
	    int ans = bad;
	    for (int i = 0, j = count; j < n; ++i, ++j) {
	 
	    // Decrement count of previous window
	    if (arr[i] > k)
	        --bad;
	 
	    // Increment count of current window
	    if (arr[j] > k)
	        ++bad;
	 
	    // Update ans if count of 'bad'
	    // is less in current window
	    ans = Math.min(ans, bad);
	    }
	    return ans;
	}
	public static void main(String[] args) {
		int[] a = {10,7,6,8,5,9};
		int n = a.length;
		int k=5;
		System.out.println("The minimum number of swaps is : " +minSwap(a,n,k));
		
	}

}
