
public class Sprinten {

	public static void main(String[] args) {
		double startpunktA = 0.0;
		double startpunktB = 250.0;
		double geschwindigkeitA = 9.5;
		double geschwindigkeitB = 7.5;
		
		System.out.println("L�ufer A L�ufer B");
		while (startpunktA <= 1000.0 && startpunktB <= 1000.0) {
			System.out.println(startpunktA + " " + startpunktB);
			startpunktA = startpunktA + geschwindigkeitA;
			startpunktB = startpunktB + geschwindigkeitB;
		}
		
	}

}
