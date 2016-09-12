package no.hib.dat100;
import easyIO.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		In tastatur = new In();
		System.out.println("Skriv tall og eksponent: ");
		int tall = tastatur.inInt();
		int eksponent = tastatur.inInt();
		double nyttTall = 1;
		
		for (int i=0;i<eksponent;i++) {
			nyttTall = nyttTall * tall;
		}
		
		System.out.println("Regnet med for-løkke: " + nyttTall);
		System.out.println("Regnet med innebygd funksjon: " + Math.pow(tall, eksponent));
	}
}
