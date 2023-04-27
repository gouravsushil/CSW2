package Assignment1;
import java.util.Scanner;

public class Q17 {
    public static int search(int[] a , int n , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        int x = a.length;
        if(n == a[mid]){
            return mid;
        }
        else if(n < a[mid]){
            return search(a,n,start,mid-1);
        }
        else
            return search(a,n,mid+1,end);
        

    }
    public static void main(String[] args) {
        int[] a = {1,4,9,15,20,26,30};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int n = sc.nextInt();
        int start = 0;
        int end = a.length-1;
        int i = search(a,n,start,end);
        System.out.println("The element is found at " +i+ " index.");

        sc.close();
    }
}
