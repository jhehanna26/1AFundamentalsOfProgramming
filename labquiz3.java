import javax.swing.JOptionPane;
public class Labquiz3 {
	
	public static void main(String[] args) {
		double price;
		
		price = Double.parseDouble(JOptionPane.showInputDialog("Customer order"));
		double payment;
		payment = Double.parseDouble(JOptionPane.showInputDialog("please enter your customer's payment: "));
		double charge = 0.12;
		double tax = 0.07;
		double servicefee = price * charge, salestax = price * tax;
		double Netbill = price + servicefee + tax;
		double change = payment - Netbill;
		
		String Total = "The netbill ==== "+ price + "\n" + "Service Charge ==== " + charge + "\n" + "Sale Tax = "+ tax + "\n" + "Net Bill "+ Netbill + "\n" + "Customer Money ==== "+ payment + "\n" + "\n" + "Change ==== " + change;
		
		JOptionPane.showMessageDialog(null, Total);
		}
}
