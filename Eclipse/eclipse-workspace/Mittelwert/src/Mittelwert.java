import java.util.Scanner;

public class Mittelwert {

	public static void main(String[] args) {
		//Deklaration von Variablen
		double zahl1;
		double zahl2 = 0;
		double m;
		
		//Eingabe
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Dieses Programm berechnet den Mittelwert zweier Zahlen.");
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		zahl1 = myScanner.nextDouble();
		
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		zahl2 = myScanner.nextDouble();
		
		//Vrearbeitung
		m = (zahl1 + zahl2)/ 2.0;
		
		//Ausgabe
		System.out.println("Mittelwert: " + m);
		
		myScanner.close();

	}

}
