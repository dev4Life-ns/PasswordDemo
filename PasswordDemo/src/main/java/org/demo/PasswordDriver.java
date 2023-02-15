package org.demo;

import javax.swing.*;
/*
*  Demo program to validate a password using regex expression
* and JOptionPane for visual interaction.
*  */


public class PasswordDriver {
	/* method uses regex expression to validate new password */
	public static boolean passwordMustFollow(String userSelection) {
		String regTest = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.+?[0-9])(?=.*?[#?!@$%^&*-]).{8,16}$";
		return userSelection.matches(regTest);
	}

	public static void main(String[] args) {


		String userInput = JOptionPane.showInputDialog(null, "Enter a new password","Password Validator",JOptionPane.WARNING_MESSAGE);
		while(!passwordMustFollow(userInput)) {
			JOptionPane.showMessageDialog(null, "Password does not meet required specifications.Please try again");
			JOptionPane.showInputDialog(null, """
					Note: Password must contain At least one uppercase letter,
					one lowercase, at least 2 digits and one special character
					and be between 8-10 long.
					Enter a new password =>\s""");
		}
		JOptionPane.showMessageDialog(null, "You have successfully updated your password!");
	}
}
