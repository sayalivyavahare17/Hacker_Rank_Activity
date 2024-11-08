// if-else Statement

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Conditional statements to determine if the number is "Weird" or "Not Weird"
        if (N % 2 != 0) {
            // Case 1: N is odd
            System.out.println("Weird");   
        } 
        else {
            // Case 2: N is even
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } 
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird"); // Input : 3 - Weired
            } 
            else if (N > 20) {
                System.out.println("Not Weird"); // Input : 24 - Not Weird
            }
        }
    }
}
