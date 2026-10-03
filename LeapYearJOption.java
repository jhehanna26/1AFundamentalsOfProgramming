import javax.swing.JOptionPane;

public class LeapYearJOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:"); // enters the year

        int year = Integer.parseInt(input);

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0); //the process whether it is True or False

        if (isLeap) {
            JOptionPane.showMessageDialog(null, year + " is a Leap Year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " is NOT a Leap Year."); // will display the result of the process
        }
    }
}