/*Given a string A, print Yes if it is a palindrome, print No otherwise.
Constraints
A will consist at most 50 lower case english letters.
Sample Input
madam
Sample Output
Yes */

import java.util.*;

public class ReverseDemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = new StringBuilder(A).reverse().toString();
        
        if (A.equals(reversed)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

// Sample Input - madam : Yes     Sayali : No

