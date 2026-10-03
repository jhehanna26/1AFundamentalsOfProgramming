import javax.swing.JOptionPane;

public class PayrollJOption {
    public static void main(String[] args) {
        
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate:"));
        
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        double gpay = hours * rate;
        double tRate;

        if (gpay <= 2000.00) {
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

        String result = "PAYROLL SUMMARY\n" +
                        "Gross Pay: Php " + gpay + "\n" +
                        "Withholding Tax (" + (tRate * 100) + "%): Php " + WTax + "\n" +
                        "Net Pay: Php " + NP;

        JOptionPane.showMessageDialog(null, result);
    }
}