import java.util.Scanner;
public class HausaufgabeEinlesen {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		double zahlDouble;
		long zahlLong;
		byte zahlByte;
		short zahlShort;
		boolean wahrheitswert;
		char buchstabe;
		
		System.out.println("Double: ");
		zahlDouble = myScanner.nextDouble();
		System.out.println(zahlDouble);
		
		zahlLong = myScanner.nextLong();
		System.out.println("Long: ");
		
		zahlByte = myScanner.nextByte();
		System.out.println("Byte: ");
		
		zahlShort = myScanner.nextShort();
		System.out.println("Short: ");
		
		wahrheitswert = myScanner.nextBoolean();
		System.out.println("Double: ");
		
		buchstabe = myScanner.next().charAt(0);
		System.out.println("Charakter: ");
		
		myScanner.close();
	}

}
