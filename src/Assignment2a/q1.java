package Assignment2a;
import java.util.ArrayList;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(10);
		a1.add(15);
		a1.add(20);
		a1.add(25);
		a1.add(30);
		
		System.out.println(a1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int x = sc.nextInt();
		boolean y = a1.contains(x);
		if(y) {
			System.out.println("The list contains " +x);
		}
		else {
			System.out.println("The list doesnot contains " +x);
		}
		
		System.out.println("Enter the element to remove ");
		int z = sc.nextInt();
		int a = a1.indexOf(z);
		a1.remove(a);
		System.out.println(a1);
		
		if(a1.isEmpty()) {
			System.out.println("The list is empty");
		}
		else {
			System.out.println("The list is not empty");
		}
	}

}
