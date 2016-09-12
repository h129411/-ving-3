package no.hib.dat100;

import easyIO.In;
public class Oppgave1 {

	public static void main(String[] args) {

		In inn = new In();
		int i = 0;
		boolean feil;
		
		while (i < 10) {
			
			feil = true;
			i += 1;
			
			System.out.println("Skriv poengsum: ");
			int poeng = inn.inInt();
			String karakter = "";
			
			while (feil) {
				
				if ( poeng > 100 || poeng < 0 )  {
					System.out.println("Feil tall, prøv igjen: ");
					poeng = inn.inInt();
				} 
				
				else {
					feil = false;
				}
			}
			
			if ( poeng >= 90 ) {
				karakter = "A";
			} else if ( poeng >= 80 ){
				karakter = "B";
			} else if ( poeng >= 60 ) {
				karakter = "C";
			} else if ( poeng >= 50 ) {
				karakter = "D";
			} else if ( poeng >= 40 ) {
				karakter = "E";
			} else {
				karakter = "F";
			}

			System.out.println("Din karakter er " + karakter);
		}
	}
}