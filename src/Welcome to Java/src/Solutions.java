import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        double d = sc.nextDouble();

        sc.nextLine(); // Clear the newline character from the buffer
  
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

// String: Hello  Double: 3.1415 Int: 42