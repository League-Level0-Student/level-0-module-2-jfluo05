import javax.swing.JOptionPane;

public class Rollercoasters {
public static void main(String[] args) {
	
		 
	String height=JOptionPane.showInputDialog("How tall are you in inches?");
	int tall=Integer.parseInt(height);

	if(tall>=48) {
		JOptionPane.showMessageDialog(null, "Congratulations! You made it on the ride! Have fun!");
		
	}else {
		
		JOptionPane.showMessageDialog(null, "Sorry, you are out of luck. You need to grow "+(48-tall) +" inches taller.");
		
	}
	
	
	
	
}
}
