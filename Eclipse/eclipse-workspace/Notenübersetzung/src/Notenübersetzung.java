import java.util.Scanner;
public class Notenübersetzung {

	public static void main(String[] args) {
		int note;
		
		Scanner newScanner = new Scanner(System.in);
		note = newScanner.nextInt();
		
		switch (note) {
		case 1:
			System.out.println("sehr gut");
			break;
		case 2:
			System.out.println("gut");
			break;
		case 3:
			System.out.println("befriedigend");
			break;
		case 4:
			System.out.println("ausreichend");
			break;
		case 5:
			System.out.println("mangelhaft");
			break;
		case 6:
			System.out.println("ungenügend");
			break;
		default:
			System.out.println("Bitte geben Sie eine Zahl ");
		}
		newScanner.close();
	}

}
