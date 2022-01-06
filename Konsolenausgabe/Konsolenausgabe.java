
public class Konsolenausgabe {

	public static void main(String[] args) {
		
		String j ="Java-Programmierung";
		String we = "In Java fühle ich mich nicht wohl.";
		String point = "*";
		
		double d = 1234.5678;
		
		System.out.println("Hallo!\b Wie geht es dir?b");
		System.out.println("Hallo!\t Wie geht es dir?t");
		System.out.println("Hallo!\n Wie geht es dir?n");
		System.out.println("Hallo!\f Wie geht es dir?f");
		System.out.println("Hallo!\r Wie geht es dir?r");
		System.out.println("Hallo!\" Wie geht es dir?");
		System.out.println("Hallo!\' Wie geht es dir?");
		System.out.println("Hallo!\\ Wie geht es dir?");
		
		// Standardausgabe 
		System.out.printf( "\n|%s|\n", j );     // |Java-Programmierung| 
		// rechtsbündig mit 20 Stellen 
		System.out.printf( "|%21s|\n", j );     // |       Java-Programmierung| 
		// linksbündig mit 20 Stellen 
		System.out.printf( "|%-21s|\n", j );    // |Java-Programm       | 
		// minimal 5 stellen 
		System.out.printf( "|%5s|\n", j );      // |Java-Programm| 
		// maximal 4 Stellen 
		System.out.printf( "|%.4s|\n", j );     // |Java| 
		// 20 Positionen, rechtsbündig, höchstens 4 Stellen von String 
		System.out.printf( "|%20.4s|\n", j );   // |                Java| 
		
		//System.out.printf("\n|%d| |%d|" , i, i);
		
		// Standard-Ausgabe von Dezimalzahlen mit 6 Nachkommastellen 
		System.out.printf( "|%f| |%f|\n" ,         d, -d);  
		// |1234,567800| |-1234,567800| 
		// 2 Nachkommastellen 
		System.out.printf( "|%.3f| |%.2f|\n" ,     d, -d);  
		// |1234,57| |-1234,57| 
		// 10 Stellen insgesamt 
		System.out.printf( "|%10f| |%10f|\n" ,     d, -d);  
		// |1234,567800| |-1234,567800| 
		// 10 Stellen gesamt, davon 2 Nachkommastellen 
		System.out.printf( "|%10.2f| |%10.2f|\n" , d, -d);  
		// |   1234,57| |   1234,57| 
		// zusätzlich Auffüllen mit Nullen 
		System.out.printf( "|%010.2f| |%010.2f|\n", d, -d);
		// |0001234,57| |-001234,57|
		
		System.out.print("Hallo ich \'programmiere\'!");
		System.out.printf("\n%s", we);
		//Hoffentlich mache ich das richtig.
		
		System.out.printf("\n%6s %8s", point,point );
		System.out.printf("\n%4s %12s", point,point );
		System.out.printf("\n%4s %12s", point,point );
		System.out.printf("\n%6s %8s", point,point );

	}

}
