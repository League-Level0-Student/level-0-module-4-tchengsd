import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What is your test score?");
		int x = Integer.parseInt(test);
		if (x >= 98) {
			JOptionPane.showMessageDialog(null, "Good! Above average!");
		} else if (x < 98 && x > 89) {
			JOptionPane.showMessageDialog(null, "Goob job, but just average.");
		} else if (x < 90 && x > 79) {
			JOptionPane.showMessageDialog(null, "Sorry, below average.");
		} else if (x < 80 && x > 69) {
			JOptionPane.showMessageDialog(null, "You probably can't eat dinner today.");
		} else if (x < 70 && x > 59) {
			JOptionPane.showMessageDialog(null, "Don't go home today.");
		} else {
			JOptionPane.showMessageDialog(null, "Find a new family.");
		}
	}
}