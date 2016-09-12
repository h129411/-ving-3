package no.hib.dat100;
import easyIO.*;

public class Oppgave4 {

	public static void main(String[] args) {

		Out ut = new Out();
		ut.out("x i grader", 15, 2);
		ut.out("x i radianer", 15, 2);
		ut.out("x i sin(x)", 15, 2);
		ut.outln("x i cos(x)", 15, 2);
		ut.outln("------------------------------------------------------------");
		
		int grader = 0;
		double radianer = 0;
		
		while ( grader <= 180 ) {
			radianer = ( Math.PI * grader ) / 180;
			ut.out(grader, 15, 2);
			ut.out(radianer, 3, 15, 2);
			ut.out(Math.sin(radianer), 3, 15, 2);
			ut.outln(Math.cos(radianer), 3, 15, 2);
			grader += 15;
		}
		
		ut.outln("------------------------------------------------------------");
	}
}
