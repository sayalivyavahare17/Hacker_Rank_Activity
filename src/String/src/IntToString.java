/*You are given an integer , you have to convert it into a string. Please complete the partially completed code in the editor. 
If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer". 
n can range between -100 to 100 inclusive. 
Sample Input - 100     Sample Output - Good job */

import java.util.*;

public class IntToString {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            // Convert the integer n to a string
            String s = String.valueOf(n);

            // Verify the conversion
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } 
            else {
                System.out.println("Wrong answer.");
            }
        } 
        catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

