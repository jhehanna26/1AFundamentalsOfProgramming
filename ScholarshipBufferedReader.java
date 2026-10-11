import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(br.readLine());

            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(br.readLine());

            System.out.print("Enter entrance exam score: ");
            double entrance = Double.parseDouble(br.readLine());

            double average = (nsat + entrance) / 2;

            System.out.println("--- APPLICATION RESULT ---");
            System.out.println("Average Score: " + average);

            if (salary > 10000 || nsat < 90 || entrance < 85) {
                System.out.println("Status: REJECTED");
            } else if (salary <= 3500 && average >= 91) {
                System.out.println("Status: ACCEPTED");
            } else {
                System.out.println("Status: FOR FURTHER STUDY");
            }

        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
    }
}