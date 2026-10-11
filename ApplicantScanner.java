import java.util.Scanner;

public class ApplicantScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship (C or N): ");
        String citizen = sc.next();

        System.out.print("Enter recommendee (R or N): ");
        String recomm = sc.next();

   
        if (recomm.equals("R") || recomm.equals("r")) {
            System.out.println("Result: ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C") || citizen.equals("c")) {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }
    }
}