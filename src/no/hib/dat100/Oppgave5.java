package no.hib.dat100;
import easyIO.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		In tastatur = new In();
		Out skjerm = new Out();
		int sum = 0;
		int maks = 0;
		
		skjerm.outln("Analyse av temperaturer");
		skjerm.outln("***********************");
		skjerm.outln("Skriv inn temperaturene:");
		
		for (int i=0;i<7;i++) {
			skjerm.out((i + 1) + ". dag: ");
			int tall = tastatur.inInt();
			sum += tall;
			maks = (tall > maks) ? tall : maks;
		}
		
		skjerm.outln( "Gjennomsnittstemperaturen var " + (sum/7) + " grader." );
		skjerm.out( "Maksimum for denne uken var " + maks + " grader." );
		
	}
}
