import java.util.*;

public class TokenDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        String[] tokens = s.trim().split("[^A-Za-z]+");
        
        //Print the number of tokens
        if (s.trim().isEmpty()) {
            System.out.println(0);
        }
        else {
            System.out.println(tokens.length);
        }
        
        //Print each token on a new line 
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

//Sample Input : My name is Sayali