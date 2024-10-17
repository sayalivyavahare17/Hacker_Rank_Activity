import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterLessThan {

    public static List<Integer> filterLessThan(int upperLimit, List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number < upperLimit) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int upperLimit = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            List<Integer> result = filterLessThan(upperLimit, numbers);
            for (int number : result) {
                System.out.println(number);
            }
        }
    }
}
