/*
 *  Aufgabe: Recherchieren Sie im Internet !
 *  
 *  Sie dürfen nicht die Namen der Variablen verändern !!!
 *  
 *  Vergessen Sie nicht den richtigen Datentyp !!
 *  
 *  @version 1.0 from 21.08.2019
 *  @author Johannes Koepcke
 */
public class WeltDerZahlen {

	public static void main(String[] args) {
		
		/*	*********************************************************
		 
		 	Zuerst werden die Variablen mit den Werten festgelegt!
		 	
		 ************************************************************ */
		 
		//Im Internet gefunden ?
		//Die Anzahl der Planeten in unserem Sonnensystem
		int anzahlPlaneten = 9;
		
		// Anzahl der Sterne in unserer Milchstraße
		
		long anzahlSterne = 1000000l;
		
		//Wie viele Einwohner hat Berlin?
		
		int bewohnerBerlin = 2000000;
		
		//Wie alt bist du? Wie viele Tage sind das?
		
		double alterTage = 9131.25;
		
		//Wie viel wiegt das schwerste Tier der Welt?
		//Schreiben Sie das Gewicht in Kilogramm auf!
		
		int gewichtKilogramm = 280000;
		
		//Schreiben Sie auf, wie viele km² das größte Land der Erde hat!
		
		int flaecheGroessteLand = 20000000;
		
		//Wie groß ist das kleinste Land der Erde?
		
		byte flaecheKleinsteLand = 12;
		
		/* ******************************************************
		 
		 	Programmieren Sie jetzt die Ausgaben der Werte in den Variablen
		 	
		******************************************************* */
		
		System.out.println("Anzahl der Planeten: " + anzahlPlaneten);
		System.out.println("Anzahl der Sterne: " + anzahlSterne);
		System.out.println("Anzahl der Einwohner Berlin: " + bewohnerBerlin);
		System.out.println("Alter in Tage: " + alterTage);
		System.out.println("Gewicht schwerstes Tier: " + gewichtKilogramm);
		System.out.println("Fläche größtes Land: " + flaecheGroessteLand);
		System.out.println("Fläche kleinstes Land: " + flaecheKleinsteLand);
		
		System.out.println(" *******  Ende des Programms  ******* ");
	}

}
