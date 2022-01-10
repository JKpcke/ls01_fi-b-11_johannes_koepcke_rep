import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Bitte geben sie ihren Namen ein " );
		
		String name = myScanner.next();
		
		System.out.print("Bitte geben sie ihr Alter ein ");
		
		int alter = myScanner.nextInt();
		
		System.out.println("Der eingegebene Name ist " + name + ".");
		
		System.out.print("Das eingegebene Alter ist " + alter + ".");

		myScanner.close();
    }
}
