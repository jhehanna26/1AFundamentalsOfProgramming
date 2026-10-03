import java.util.Scanner;

public class PayrollScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate (Php): ");
        double rate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        double gpay = hours * rate;
        double tRate = 0;

        if (gpay <= 2000) {
            tRate = 0.10;
        } else if (gpay <= 4000) {
            tRate = 0.12;
        } else if (gpay <= 10000) {
            tRate = 0.15;
        } else {
            tRate = 0.20;
        }

        double WTax = gpay * tRate;
        double NP = gpay - WTax;

        System.out.println("--- PAYROLL SUMMARY ---");
        System.out.println("Gross Pay: Php " + gpay);
        System.out.println("Withholding Tax (" + (tRate * 100) + "%): Php " + WTax);
        System.out.println("Net Pay: Php " + NP);

        
    }
}