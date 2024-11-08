// Loops

import java.util.*;

class Solu {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int currentTerm = a; // Starting value for the series

            StringBuilder series = new StringBuilder(); // StringBuilder to store the result for this query

            for (int j = 0; j < n; j++) {
                currentTerm += Math.pow(2, j) * b;
                series.append(currentTerm).append(" ");
            }

            System.out.println(series.toString().trim());
        }
    }
}

// 2
// 0 2 10
// 5 3 5
