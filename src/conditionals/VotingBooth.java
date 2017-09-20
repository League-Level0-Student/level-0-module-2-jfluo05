package conditionals;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you (in years)?");

		int old = Integer.parseInt(age);

		if(old >= 18) {
			JOptionPane.showInputDialog("Who should the next president be?");
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
		
	}

}
