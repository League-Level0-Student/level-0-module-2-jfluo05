//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle= JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh? (One word answer)");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equalsIgnoreCase("meat")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}else{
			JOptionPane.showMessageDialog(null, "Almost, the answer is meat. Here is the riddle :Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		}
		
		
		
		riddle= JOptionPane.showInputDialog("If you have me, you want to share me. If you share me, you haven't got me. What am I? (One word answer).");
		if(riddle.equalsIgnoreCase("secret")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}else{
			JOptionPane.showMessageDialog(null, "Almost, the answer is secret. Here is the riddle : If you have me, you want to share me. If you share me, you haven't got me. What am I?");
		}
		JOptionPane.showMessageDialog(null, "Your score is "+score+".");
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		
	}
}

