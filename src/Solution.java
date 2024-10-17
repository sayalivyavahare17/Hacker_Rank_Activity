import java.util.*;

public class Solution {

    public static List<Integer> createArray(int n) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(i);
        }
        return array;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> result = createArray(n);

            System.out.println(result);
        }
    }
}
