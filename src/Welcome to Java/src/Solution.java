import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 42;
        int b = 100;
        int c = 125;

        // Read each integer and print it on a new line
        for (int i = 0; i < 3; i++) {
            int number = sc.nextInt();
            System.out.println(number); 
        }
    }
}

// Output : 42  100  125