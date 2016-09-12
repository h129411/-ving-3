package no.hib.dat100;
import easyIO.*;

public class Oppgave2 {
	public static void main(String[] args) {
		
		// Åpner fil og deklarerer variabler
		In fil = new In("src/no/hib/dat100/test.txt");
		int antallOrd = 0;
		int i = 0;

		// Leser ord i filen frem til blank linje, teller for hvert ord.
		while ( fil.hasNext(" ") ) {
			fil.inWord();
			antallOrd += 1;
		}
		
		// Stenger filen, og åpner den på nytt for å lese inn ord.
		fil.close();
		fil = new In("src/no/hib/dat100/test.txt");
		
		// Deklarerer strengtabell som har plass til alle ord i filen.
		String[] ordFraFil = new String[antallOrd];
		
		// Leser ord fra fil og lagrer i strengtabell.
		for (i=0;i<antallOrd;i++) {
			String ord = fil.inWord();
			ordFraFil[i] = ord;
		}
		
		// Printer ut verdiene i strengtabell.
		for (String ord : ordFraFil) {
			System.out.println(ord);
		}
		
		int likeOrd = 0;
		
		In tastatur = new In();
		System.out.println("Skriv inn mønster: ");
		String pattern = tastatur.inWord();
		
		for ( String ord : ordFraFil ) {
			if ( ord.contains(pattern) ) {
				likeOrd += 1;
			}
		}
		
		System.out.println("Det er " + likeOrd + " ord i listen som inneholder mønsteret '" + pattern + "'.");
		
		for ( String ord : ordFraFil ) {
			
			int ordLengde = ord.length();
			int index = ordLengde/2 - 1;

			if ( ordLengde == 1 ) {
				System.out.println(ord);
			}
			else if ( (ordLengde % 2) == 0 ) {
				System.out.println(ord.substring(index, index + 2) );
			}
			else {
				System.out.println( ord.substring(index, index + 3));
			}
		}	
	}
}