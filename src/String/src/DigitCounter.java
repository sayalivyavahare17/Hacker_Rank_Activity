import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String input = sc.nextLine();
 
        try {
            int number = Integer.parseInt(input);
            if (number < 1) {
                System.out.println("INVALID INPUT"); 
            } 
            else {
                int count = 0;

                while (number > 0) {
                    number /= 10; 
                    count++; 
                }
                System.out.println(count); 
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("INVALID INPUT"); 
        }
        
        sc.close(); // Close the scanner
    }
}
