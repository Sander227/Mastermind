import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Number100Guess {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Random rand = new Random();
		int geheimeNummer = rand.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);

		boolean correcteGok = false;

		System.out.println("Raad het random getal tussen de 1 en 100. Je hebt 7 kansen om het te raden");

		int aantalGokken = 0;

		while (aantalGokken < 7) {
			aantalGokken++;
			System.out.println("Gok " + aantalGokken);
			int gok = scanner.nextInt();

			if (gok == geheimeNummer) {
				System.out.println("Heel goed. Je hebt het getal precies geraden in " + aantalGokken + " attempts.");
				correcteGok = true;
				break;

			} else if (gok > geheimeNummer) {
				System.out.println("Te hoog");
			} else {
				System.out.println("Te laag.");
			}

		}

		if (!correcteGok) {
			System.out.println("Helaas, het is je niet gelukt om het getal te raden in 7 beurten. Het nummer was: "+ geheimeNummer);
		}

		scanner.close();

	}

}
