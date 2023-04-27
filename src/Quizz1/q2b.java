package Quizz1;

import java.util.HashMap;
import java.util.Scanner;

public class q2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> map = new HashMap<>();
	
	    map.put(1, "AAA");
	    map.put(2, "BBB");
	    map.put(3, "CCC");
	    map.put(4, "DDD");
	    map.put(5, "FFF");

	    System.out.println("Original Map: " + map);

	    System.out.println("Enter a key:");
	    int x = sc.nextInt();
	    
	    System.out.println("Enter the value: ");
	    String y = sc.next();
	    
	    if (map.containsKey(x) && map.get(x).equals(y)) {
	      map.remove(x);  
	      System.out.println("Updated Map: " + map);    
	    } 
	    else {   
	      System.out.println("No changes made to the Map as this key value pair doesnot exist.");    
	    }    	
	}

}
