
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveOddPositions {

    public static List<Integer> removeOddPositions(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 != 0) {
                result.add(lst.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> lst = new ArrayList<>();
            while (scanner.hasNextInt()) {
                lst.add(scanner.nextInt());
            }

            List<Integer> result = removeOddPositions(lst);
            for (int number : result) {
                System.out.println(number);
            }
        }
    }
}
