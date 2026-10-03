import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayrollBufferedReader {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		try {
			System.out.print("Enter hourly pay rate: ");
			double sahod = Double.parseDouble(br.readLine());
			
			System.out.print("Enter hours worked: ");
			double work = Double.parseDouble(br.readLine());
			
			double gpay = work * sahod;
			double tRate;
			
			if (gpay <= 2000.00) {
				tRate = 0.10;
			} else if (gpay <= 4000.00) {
				tRate = 0.12;
			} else if (gpay <= 10000.00) {
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

        } catch (IOException e) {
            System.out.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
    
			   
			
		
	}
}