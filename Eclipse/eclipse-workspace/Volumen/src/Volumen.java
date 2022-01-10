import java.util.Scanner;

public class Volumen {

	public static final double PI = 3.1415;

	public static void main(String[] args) {
		double radius = 0.0f;
		double volumen = 0.0f;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Bitte geben sie den Radius ein.");
		radius = myScanner.nextDouble();
		
		volumen = 4.0f/3.0f * PI * (radius*radius*radius);
		
		System.out.println("Das Volumen der Kugel lautet " + volumen);
		myScanner.close();
	}

}
