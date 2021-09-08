package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			int poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));
			
			if(poengsum < 0 || poengsum > 100) {
				showMessageDialog(null, "Error, ugylidg poengsum");
				Integer.parseInt(showInputDialog("Skriv inn poengsum: "));
			}
			
			if (poengsum <= 100 && poengsum >= 90) {
				showMessageDialog(null, "A");
			} else if (poengsum <= 89 && poengsum >= 80) {
				showMessageDialog(null, "B");
			} else if (poengsum <= 79 && poengsum >= 60) {
				showMessageDialog(null, "C");
			} else if (poengsum <= 59 && poengsum >= 50) {
				showMessageDialog(null, "D");
			} else if (poengsum <= 49 && poengsum >= 40) {
				showMessageDialog(null, "E");
			} else if (poengsum <= 39 && poengsum >= 0) {
				showMessageDialog(null, "F");
			} 
		}
	}
}