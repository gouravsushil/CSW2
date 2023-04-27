package Array;

public class indexArray {

	public static void main(String[] args) {
		int[] a = {8,-1,6,1,9,3,2,7,4,-1};
		for(int i=0 ; i<a.length ; i++) {
			int curr=i;
			int value=-1;
			
			while(a[curr] != -1 && a[curr] != curr) {
				int temp = a[curr];
				a[curr] = value;
				value = curr = temp;
			}
			if(value != -1) {
				a[curr] = value;
			}
		}
		
		for(int j:a) {
			System.out.print(j+" ");
		}

	}

}
