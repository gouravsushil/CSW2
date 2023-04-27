package Assignment3;

import java.util.HashMap;

public class q5 {

	public static void sortByOrder(int[] a1, int size1, int[] a2, int size2){    
		HashMap<Integer,Integer> ht = new HashMap<>();
		int value;
		for (int i = 0; i < size1; i++) {
			if (ht.containsKey(a1[i])) {
			   value = ht.get(a1[i]);
			   ht.put(a1[i], value + 1);
			} 
			else {
			   ht.put(a1[i], 1);
			}
		}
		
		for (int j = 0; j < size2; j++) {
			if (ht.containsKey(a2[j])) {
			   value = ht.get(a2[j]);
			   for (int k = 0; k < value; k++) {
			      System.out.print(a2[j]+" ");
			   }
			   ht.remove(a2[j]);
			}
		}
		
		for (int i = 0; i < size1; i++) {
			if (ht.containsKey(a1[i])) {
			     value = ht.get(a1[i]);
			     for (int k = 0; k < value; k++) {
			        System.out.print(a1[i]+" ");
			     }
			     ht.remove(a1[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] a1 = {2,1,2,5,7,1,9,3,6,8,8};
		int[] a2 = {2,1,8,3};
		sortByOrder(a1,a1.length,a2,a2.length);
//		for(int i: a1) {
//			System.out.print(i+" ");
//		}
	}

}
