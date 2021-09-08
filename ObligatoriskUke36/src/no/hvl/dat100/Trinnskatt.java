package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Trinnskatt {

	public static void main(String[] args) {
		String bruttoInntektTxt = showInputDialog("Din bruttoInntekt: ");
		int bruttoInntekt = parseInt(bruttoInntektTxt);
		int inntekt = (bruttoInntekt);

		double trinnSats0 = 0;
		double trinnSats1 = 0.0093; // delt på 100 grunnet tall var oppgitt i prosent
		double trinnSats2 = 0.0241;
		double trinnSats3 = 0.1152;
		double trinnSats4 = 0.1452; 

		if (bruttoInntekt >= 0 && bruttoInntekt <= 164100) { // trinn 0
			showMessageDialog(null, "Din trinnskatt er: " + inntekt * trinnSats0);
		} else if (bruttoInntekt >= 164101 && bruttoInntekt <= 230950) { // trinn 1
			showMessageDialog(null, "Din trinnskatt er: " + Math.round(inntekt * trinnSats1 * 100) / 100.00); // Bruker Math.round for å få 2 desimaler																																			
		} else if (bruttoInntekt >= 230951 && bruttoInntekt <= 580650) {
			showMessageDialog(null, "Din trinnskatt er: " + Math.round(inntekt * trinnSats2 * 100) / 100.00);
		} else if (bruttoInntekt >= 580651 && bruttoInntekt <= 934050) { // trinn 3
			showMessageDialog(null, "Din trinnskatt er: " + Math.round(inntekt * trinnSats3 * 100) / 100.00);
		} else if (bruttoInntekt >= 934051) { // trinn 4
			showMessageDialog(null, "Din trinnskatt er: " + Math.round(inntekt * trinnSats4 * 100) / 100.00);
		}

	}
}