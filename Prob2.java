import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press Enter to display even numbers 2-100");
        sc.nextLine(); 

        String output = "";
        
        for (int i = 2; i <= 100; i += 2) {
            output = output + i + " ";
            
            
            if (i % 20 == 0) {
                output = output + "\n";
            }
        }
        
        System.out.println(output);
        JOptionPane.showMessageDialog(null, output);
        
        
    }
}