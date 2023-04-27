package Assignment1;
import java.util.Scanner;

public class Q3 {

	public static int countDigit(int x) {
		int ctr=0;
		while(x!=0) {
			x = x/10;
			ctr++;
		}
		return ctr;
	}
	public static int reverse(int n) {
		if(n == 0) {
			return n;
		}
		int x = n%10;
//		n = n/10;
		int sum = x*(int)Math.pow(10, countDigit(n/10));
		return sum+reverse(n/10);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = reverse(n);
		System.out.println(reverse);
		sc.close();
	}

}
