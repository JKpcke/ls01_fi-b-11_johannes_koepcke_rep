import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		int zeitraum = 0;
		double kapital = -1.0;
		double endkapital = 0.0;
		double zinssatz = -1.0;
		int zeit = 1;
		
		Scanner zins = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Laufzeit ein.");
		zeitraum = zins.nextInt();
		System.out.println("Bitte geben Sie die H?he des Kapitals ein.");
		kapital = zins.nextDouble();
		endkapital = kapital;
		System.out.println("Bitte geben Sie den Zinssatz ein.");
		zinssatz = zins.nextDouble();
		
		do {
			kapital = kapital * ((zinssatz/100)+1);
			//System.out.println("Das Kapital in Monat " + zeit + " betr?gt " + kapital + " Euro.");
			zeit++;
		} while(zeit <=zeitraum);
		
		System.out.println("Laufzeit (in Jahren) des Sparvertrages: " + zeitraum);
		System.out.println("Wie viel Kapital (in Euro) m?chten Sie anlegen: " + endkapital);
		System.out.println("Zinssatz: " + zinssatz);
		System.out.println("");
		System.out.println("Eingezahltes Kapital: " + endkapital);
		System.out.printf("Ausgezahltes Kapital: ");
		System.out.printf("%.2f",kapital);
		zins.close();
	}

}
