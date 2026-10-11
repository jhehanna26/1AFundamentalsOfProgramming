import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ApplicantBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height (in cm): ");
            double height = Double.parseDouble(br.readLine());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter citizenship code (C / N): ");
            String citizen = br.readLine().toUpperCase();

            System.out.print("Enter recommendee code (R / N): ");
            String recomm = br.readLine().toUpperCase();

            System.out.println("--- APPLICATION RESULT ---");

            if (recomm.equals("R")) {
                System.out.println("Status: ACCEPTED - Obi Wan's Recommendee");
            } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C")) {
                System.out.println("Status: ACCEPTED");
            } else {
                System.out.println("Status: REJECTED");
            }

        } catch (IOException e) {
            System.out.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Height and Age must be numbers.");
        }
    }
}