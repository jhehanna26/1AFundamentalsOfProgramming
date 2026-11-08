import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int highest = 0;
        int lowest = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            
            if (i == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }
        
        // JOptionPane for output
        JOptionPane.showMessageDialog(null, 
            "Highest number: " + highest + 
            "\nLowest number: " + lowest);
        
        
    }
}