import java.util.Scanner;

public class PCHaendlerMitMethoden {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		String artikel = liesString(myScanner,"Was möchten Sie bestellen?");
		int anzahl = liesInt(myScanner,"Geben sie die Anzahl ein: ");
		double preis = liesDouble(myScanner,"Geben Sie den Nettopreis ein: ");
		double mwst = liesDouble(myScanner,"Geben Sie den Mehrwertsteuersatz in Prozent ein");
		double nettogesamtpreis = berechneGesamtnettopreis(anzahl,preis);
		double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis,mwst);
		
		rechnungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
	myScanner.close();
	}
public static String liesString(Scanner ms,String text) {
	System.out.println(text);
	String artikel = ms.next();
	return artikel;
}
public static int liesInt(Scanner ms,String text) {
	System.out.println(text);
	int zahl = ms.nextInt();
	return zahl;
}
public static double liesDouble(Scanner ms,String text) {
	System.out.println(text);
	double zahl = ms.nextDouble();
	return zahl;
}
public static double berechneGesamtnettopreis(int anzahl, double nettopreis) {
	double gesamt = anzahl * nettopreis;
	return gesamt;
}
public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) {
	double gesamt = nettogesamtpreis * (1 + mwst /100);
	return gesamt;
}
public static void rechnungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
	System.out.println("\tRechnung");
	System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
	System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");

}
}
