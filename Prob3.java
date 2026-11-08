import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 20000.00;
        System.out.println("Starting balance: P" + balance);
        
        while (true) {
            System.out.print("Enter amount (positive=deposit, negative=withdraw, 0=exit): ");
            double amount = sc.nextDouble();
            
            if (amount == 0) {
                break; 
            }
            
            if (amount > 0) {
                balance = balance + amount;
                JOptionPane.showMessageDialog(null, 
                    "Deposited: P" + amount + 
                    "\nOutstanding Balance: P" + balance);
            } else {
                double withdraw = -amount;
                if (withdraw > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                } else {
                    balance = balance - withdraw;
                    JOptionPane.showMessageDialog(null, 
                        "Withdrawn: P" + withdraw + 
                        "\nOutstanding Balance: P" + balance);
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Final Balance: P" + balance + "\nThank you!");
        
    }
}