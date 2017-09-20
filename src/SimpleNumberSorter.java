import javax.swing.JOptionPane;

public class SimpleNumberSorter {
public static void main(String[] args) {
	
	String num1=JOptionPane.showInputDialog("Choose a number.");
	String num2=JOptionPane.showInputDialog("Choose another number.");
	String num3=JOptionPane.showInputDialog("Choose another number.");
	
	int number1=Integer.parseInt(num1);
	int number2=Integer.parseInt(num2);
	int number3=Integer.parseInt(num3);
	
	if(number1<number2 && number1<number3) {
		
	}
}
}
