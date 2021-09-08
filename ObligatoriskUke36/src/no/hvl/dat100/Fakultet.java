package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Fakultet {

	static int fakultet(int n) {
		int svar = 1;

		for (int i = n; i > 0; i--) {
			svar = svar * i;
		}

		return svar;
	}
 
	public static void main(String[] args) {
		int tall = Integer.parseInt(showInputDialog("Skriv inn tall: "));

		while (tall <= 0) {
			tall = Integer.parseInt(showInputDialog("Skriv inn tall: "));
		}

		System.out.println(fakultet(tall));

	}

}
