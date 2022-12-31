package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelInput = JOptionPane.showInputDialog(args, "How many nickels do u have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickelInt = Integer.parseInt(nickelInput);
		// Ask the user how many dimes they have, and convert their answer
		String dimeInput = JOptionPane.showInputDialog(args, "How many dimes do u have?");
		
		int dimeInt = Integer.parseInt(dimeInput);
		// Ask the user how many quarters they have, and convert their answer
		String quarterInput = JOptionPane.showInputDialog(args, "How many quarters do u have?");
		
		int quarterInt = Integer.parseInt(quarterInput);
		// Calculate how much money the user has.  Hint: Use a double variable 
		
		double nickelInt2 = (nickelInt * 0.15);
		double dimeInt2 =(dimeInt * 0.10);
		double quarterInt2 =(quarterInt * 0.25);
		
		double total = nickelInt2 + dimeInt2 + quarterInt2;
		
		System.out.println("You have $" + total);

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

