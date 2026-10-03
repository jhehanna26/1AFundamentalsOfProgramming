import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeapYearBufferedReader {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: "); // where it enters the input
            int year = Integer.parseInt(read.readLine());

            boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0); // the process

            if (isLeap) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year."); // the display of the result from the process
            } 

        } catch (IOException e) {
            System.out.println("Error in reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only, not letters."); // the catch is where it catches the error if your input is invalid 
        }
    }
}