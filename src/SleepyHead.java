
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int value = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
		if (value == 0) {
			System.out.println("Get up, lazybones!");
		}
		if(value == 1) {
			System.out.println("Sleep in");
		}
	}
}
