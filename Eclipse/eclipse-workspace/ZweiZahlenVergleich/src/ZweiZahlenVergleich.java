import java.util.Scanner;

public class ZweiZahlenVergleich {

	public static void main(String[] args) {
		int zahl1 = 0;
		int zahl2 = 0;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Bitte gib die erste Zahl ein: ");
		zahl1 = myScanner.nextInt();
		
		System.out.println("Bitte gib die zweite Zahl ein: ");
		zahl2 = myScanner.nextInt();
		
		if(zahl1 == zahl2) {System.out.println(zahl1 + " ist identisch mit " + zahl2);
		}else if (zahl1 > zahl2) {
			System.out.println(zahl1 + " ist gr��er als " + zahl2);
		}else if (zahl1 < zahl2) {
			System.out.println(zahl1 + " ist kleiner als " + zahl2);
		}
		myScanner.close();
	}

}
