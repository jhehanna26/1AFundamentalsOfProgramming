import javax.swing.JOptionPane;

public class ScholarshipJOption {
    public static void main(String[] args) {
        
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double score = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score:")); // it is where you enter the data

        double average = (nsat + score) / 2; // calculation to get the average data
        String status; 

        if (salary > 10000 || nsat < 90 || score < 85) {
            status = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            status = "ACCEPTED";
        } else {
            status = "FOR FURTHER STUDY";
        } // determines the data 

        JOptionPane.showMessageDialog(null, "Average: " + average + "\nResult: " + status); //displays the output
    }
}