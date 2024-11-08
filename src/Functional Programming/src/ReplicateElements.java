import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplicateElements {

    public static List<Integer> replicateElements(int n, List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        for (int elem : lst) {
            for (int i = 0; i < n; i++) {
                result.add(elem);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> lst = new ArrayList<>();

            while (scanner.hasNextInt()) {
                lst.add(scanner.nextInt());
            }

            List<Integer> result = replicateElements(n, lst);
            for (int elem : result) {
                System.out.println(elem);
            }
        }
    }
}
