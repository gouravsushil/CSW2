package Practice1;

import java.util.HashMap;
public class Q3 {

	public static int major(int[] a , int k) {
		HashMap <Integer , Integer> hs = new HashMap<>();
		for(int i:a) {
			if(hs.containsKey(i)) {
				if(hs.get(i)+1 == k)
					return i;
				hs.put(i, hs.get(i)+1);
			}
			else
				hs.put(i, 1);
		}
		return -1;
	}
	public static void main(String[] args) {

		int[] a = {1,3,4,5,43,3,4,5,5,6,6,6,5};
		int k = 3;
		System.out.println(major(a,k));
		
	}

}
