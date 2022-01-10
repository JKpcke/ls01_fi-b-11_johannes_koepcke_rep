import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		
		int zahl1 = myScanner.nextInt();
		
		System.out.print("Bitte geben sie eine zweite ganze Zahl ein: ");
		
		int zahl2 = myScanner.nextInt();
		
		int ergebnisAddition = zahl1 + zahl2;
		
		System.out.print("\n\n\nErgebnis der Addition lautet: ");
		System.out.print(zahl1 + " + " + zahl2 + " = " + ergebnisAddition);
		
		int ergebnisSubtraktion = zahl1 - zahl2;
		
		System.out.print("\n\n\nErgebnis der Subtraktion lautet: ");
		System.out.print(zahl1 + " - " + zahl2 + " = " + ergebnisSubtraktion);
		
		int ergebnisMultiplikation = zahl1 * zahl2;
		
		System.out.print("\n\n\nErgebnis der Multiplikation lautet: ");
		System.out.print(zahl1 + " * " + zahl2 + " = " + ergebnisMultiplikation);
		
		int ergebnisDivision = zahl1 / zahl2;
		
		System.out.print("\n\n\nErgebnis der Division lautet: ");
		System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisDivision);
		
		myScanner.close();
    }
}
