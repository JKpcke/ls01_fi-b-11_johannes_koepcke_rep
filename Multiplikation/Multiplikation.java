import java.util.Scanner;

public class Multiplikation {

	public static void main(String[] args) {
		  double zahl1 = 0.0, zahl2 = 0.0, erg = 0.0;

	        Scanner myScanner = new Scanner(System.in);
	       
	        //1.Programmhinweis
	        hinweis();
	        
	        //4.Eingabe
	      zahl1 = eingabe1(myScanner);
	      zahl2 = eingabe2(myScanner);
	       
	        //3.Verarbeitung
	        erg = verarbeiten(zahl1,zahl2);

	        //2.Ausgabe   
	        ausgabe(zahl1,zahl2,erg);
	        
	        myScanner.close();
	}
	
	public static void hinweis() {
		 System.out.println("Hinweis: ");
	     System.out.println("Das Programm multipliziert 2 eingegebene Zahlen. ");
	}
	
	public static void ausgabe(double zahl1, double zahl2,double erg) {
		System.out.println("Ergebnis der Multiplikation: ");
        System.out.printf("%.2f * %.2f = %.2f%n", zahl1, zahl2, erg);
	}
	
	public static double verarbeiten(double zahl1, double zahl2) {
		double erg = zahl1 * zahl2;
		return erg;
	}
	public static double eingabe1(Scanner myScanner) {
		double zahl = 0.0f;
		System.out.print(" 1. Zahl: ");
		zahl = myScanner.nextDouble();
		return zahl;
	}
	public static double eingabe2(Scanner myScanner) {
		double zahl = 0.0f;
		System.out.print(" 2. Zahl: ");
		zahl = myScanner.nextDouble();
		return zahl;
	}
}
