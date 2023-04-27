package Assignment2a;
import java.util.Scanner;
import java.util.Stack;

public class q3 {

	public static void main(String[] args) {
	    Stack<Integer> s1 = new Stack<>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a decimal number");
	    int num = sc.nextInt();
	    
	    while(num != 0){
	    	
	    	int r = num % 2;
	    	s1.push(r);
	    	num = num/2;
	    }
	    int i = s1.size()-1;
	    long l =0;
	    while(!s1.isEmpty()) {
	    	l = (long)Math.pow(10, i--)*s1.pop()+l;  // to store the binary number 
//	    	System.out.print(s1.pop()+" ");
	    }
	    System.out.println(l);
	}

}
