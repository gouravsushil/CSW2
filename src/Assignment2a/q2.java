package Assignment2a;

import java.util.LinkedList;
import java.util.Scanner;

class student{
	String name;
	int age;
	double mark;
	student(String name, int age, double mark){
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
}
public class q2 {
	
	public static void print(LinkedList<student> l1) {
		for(int i=0 ; i<l1.size(); i++) {
			System.out.println("Name: " +l1.get(i).name+ " Age: " +l1.get(i).age+ " Mark: " +l1.get(i).mark);
		}
	}
	public static int search(LinkedList<student> l1, student s1) {
//		LinkedList<student> curr = l1;
		for(int i=0 ; i<l1.size(); i++) {
			if(s1.name.equals(l1.get(i).name) && (s1.age == l1.get(i).age) && (s1.mark == l1.get(i).mark)) {
				return i;
			}
		}
		return -1;
	}
	public static student newObject() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		double mark = sc.nextDouble();
		return new student(name, age, mark);
	}
	public static void delete(LinkedList<student> l1, student s1) {
//		int z = l1.indexOf(s1);
		int index = search(l1, s1);
		if(index != -1)
		   l1.remove(index);
		
	}
	public static void main(String[] args) {
		LinkedList<student> l1 = new LinkedList<>();
		l1.add(new student("Sushil", 20, 55));
		l1.add(new student("Vivek", 20, 70));
		l1.add(new student("Anurag", 20, 70));
		l1.add(new student("Sourav", 20, 70));
		
//		System.out.println(l1);
		print(l1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student object to search");
//		boolean z = search(l1,new student(sc.next(),sc.nextInt(),sc.nextDouble()));
		int z = search(l1,newObject());
		if(z == -1) 
			System.out.println("Falsse");
		else
			System.out.println("True");
		
		System.out.println("Enter the student object to delete");
		delete(l1,newObject());
		
		print(l1);
		System.out.println("The number of object present in list is " +l1.size());
		
	}

}
