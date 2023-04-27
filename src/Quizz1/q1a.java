package Quizz1;

public class q1a {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;

        while (count < 5) {
            if (isFermatPrime(n)) {
                System.out.println(n);
                count++;
            }

            n++;
        }
    }

    public static boolean isFermatPrime(int n) {  // O(1) time complexity 
        if (n == 0 || n == 1)  // O(1) time complexity 
            return false;  // O(1) time complexity 

        for (int i = 2; i < n; i++) {   // O(n) time complexity 
            if (Math.pow(i, n - 1) % n != 1)   // O(1) time complexity 
                return false;   // O(1) time complexity 
        }

        return true;   // O(1) time complexity 
    } 
}

//Time Complexity: O(n).
