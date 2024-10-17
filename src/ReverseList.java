import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(19, 22, 3, 28, 26, 17, 18, 4, 28, 0);
        List<Integer> outputList = reverseList(inputList);

        for (Integer num : outputList) {
            System.out.println(num);
        }
    }
}
