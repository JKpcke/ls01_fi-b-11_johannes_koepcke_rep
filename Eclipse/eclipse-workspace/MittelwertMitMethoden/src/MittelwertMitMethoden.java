import java.util.Scanner;

public class MittelwertMitMethoden {

	public static void main(String[] args) {
		//Deklaration von Variablen
		double zahl1;
		double zahl2;
		double m;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Dieses Programm berechnet den Mittelwert zweier Zahlen.");
		
		zahl1 = eingabe(myScanner,"Bitte geben Sie die erste Zahl ein: ");
		zahl2 = eingabe(myScanner,"Bitte geben Sie die zweite Zahl ein: ");
		m = berechneMittelwert(zahl1,zahl2);
		ausgabe(m);
		
		myScanner.close();
	}
	//static nötig um eine Methode ohne Objekt aufrufen zu können
	public static double eingabe(Scanner ms,String text) {
		System.out.println(text);
		double zahl = ms.nextDouble();
		return zahl;
	}
	
	public static double berechneMittelwert(double zahl1, double zahl2) {
		double m = (zahl1 + zahl2)/2.0;
		return m;
	}
	
	public static void ausgabe(double m) {
		System.out.println("Mittelwert: " + m);
	}
}
