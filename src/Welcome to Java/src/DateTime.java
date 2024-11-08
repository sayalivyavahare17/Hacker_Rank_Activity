import java.io.*;
import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();  // Initialize Calendar instance
        
        calendar.set(Calendar.YEAR, year);   // Set the date
        calendar.set(Calendar.MONTH, month - 1); // Months are 0-based in Calendar
        calendar.set(Calendar.DAY_OF_MONTH, day);
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);   // Get the day of the week
        
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };  // Convert to string representation
        
        return days[dayOfWeek - 1];
    }
}

public class DateTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);  // Print the result directly to the console

        bufferedReader.close();
    }
}


/*Sample Input - 08 05 2015
Sample Output - WEDNESDAY */