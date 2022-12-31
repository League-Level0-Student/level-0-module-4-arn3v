package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {

	String testScoreString = JOptionPane.showInputDialog("Enter your test score:");
    double testScore = Double.parseDouble(testScoreString);

    if (testScore >= 90) {
      JOptionPane.showMessageDialog(null, "Good job");
    } else if (testScore >= 80) {
      JOptionPane.showMessageDialog(null, "Mid");
    } else if (testScore >= 70) {
      JOptionPane.showMessageDialog(null, "Still bad but u can do better");
    } else {
      JOptionPane.showMessageDialog(null, "Bro ur trash lol");
    }
  }
	
}

