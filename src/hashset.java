import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// creation
		HashSet<Integer> set1 = new HashSet<>();
		
		// insertion 
		set1.add(1);
		set1.add(5);
		set1.add(8);
		set1.add(9);
		set1.add(6);
		set1.add(1);
		
		//print all elements
		System.out.println(set1);
		
		//delete
		set1.remove(8);
		
		System.out.println(set1);
		
		//searching
		if(set1.contains(2)) {
			System.out.println("2 is present");
		}
		else
			System.out.println("2 is not present");
		
		//traversal
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
