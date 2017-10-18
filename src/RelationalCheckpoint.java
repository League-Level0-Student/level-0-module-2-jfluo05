import javax.swing.JOptionPane;

public class RelationalCheckpoint {
public static void main(String[] args) {
	
	String flour=JOptionPane.showInputDialog("How many cups of flour do you have? (in number form).");
	int n=Integer.parseInt(flour);
	if(n<2){
		JOptionPane.showMessageDialog(null, "Go to the store to get more flour.");
	}
	String people=JOptionPane.showInputDialog("How many people are you going to give cookies to? (in number form).");
	int p=Integer.parseInt(people);
	if(p>30){
		JOptionPane.showMessageDialog(null, "You are going to have to bake 2 batches of cookies!");		
	}
	String batches= JOptionPane.showInputDialog("How many batches of cookies did you bake?(in number form).");
	int b=Integer.parseInt(batches);
	if(b==2){
		JOptionPane.showMessageDialog(null, "You are lucky to have so many friends!");
	}
}
}
