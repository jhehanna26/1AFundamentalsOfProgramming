import java.util.Scanner;

public class LeapYearScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: "); //to input the year here
        int year = sc.nextInt();

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;    
        } // process to know if will fall to True or False.

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        } // displays the result of the process.

        
    }
}