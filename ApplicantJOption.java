import javax.swing.JOptionPane;

public class ApplicantJOption {
    public static void main(String[] args) {
        String h = JOptionPane.showInputDialog("Enter height:");
        int height = Integer.parseInt(h);

        String a = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(a);

        String citizen = JOptionPane.showInputDialog("Enter citizenship C or N:");
        String recomm = JOptionPane.showInputDialog("Enter recommendee R or N:");

        if (recomm.equals("R") || recomm.equals("r")) {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25 && (citizen.equals("C") || citizen.equals("c"))) {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
    }
}