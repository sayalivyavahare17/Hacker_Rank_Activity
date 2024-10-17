import java.util.List;

public class SumOddEle {

    public static int sumOddElements(List<Integer> list) {
        int sum = 0;

        for (int num : list) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(3, 2, 4, 6, 5, 7, 8, 0, 1);
        int result = sumOddElements(inputList);

        System.out.println(result);
    }
}
