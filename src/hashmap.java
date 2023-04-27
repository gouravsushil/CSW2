import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> m1 = new HashMap<>();
		
		// insertion
		m1.put(13,"Sushil");
		m1.put(14,"Anurag");
		m1.put(10,"Souerav");
		m1.put(40,"Vivek");
		m1.put(31,"Anil");
		m1.put(41,"Biswanath");
		m1.put(64,"Shubham");
		m1.put(18,"Kamlesh");
		
		// printing
		System.out.println(m1);
		
		m1.put(18, "Tushar");  // updates the value of the key to the new value
		
		System.out.println(m1);
		
		//search
		m1.containsKey(15);
		System.out.println(m1.get(15));
		
//		 traversal
//		Iterator<Integer> itr = m1.keySet().iterator();
//		while(itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key+" "+m1.get(key));
////			System.out.print(itr.next()+" ");
//		}
		
//		for(Map.Entry<Integer,String> e : m1.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
		
		// to get only keys
		Set<Integer> keys = m1.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+m1.get(key));
		}
		
	}
}
