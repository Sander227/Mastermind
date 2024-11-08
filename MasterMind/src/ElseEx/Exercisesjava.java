package ElseEx;

import java.util.Scanner;

public class Exercisesjava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// exercise 32

//		System.out.println("Enter your first number");
//		int num1 = sc.nextInt();
//		System.out.println("Enter your second number");
//		int num2 = sc.nextInt();
//
//		if (num1 != num2) {
//			System.out.println(num1 + "!=" + num2);
//		}
//		if (num1 < num2) {
//			System.out.println(num1 + "<" + num2);
//		}
//		if (num1 <= num2) {
//			System.out.println(num1 + "<=" + num2);
//		}
//
//		if (num1 > num2) {
//			System.out.println(num1 + ">" + num2);
//		}
//
//		if (num1 >= num2) {
//			System.out.println(num1 + ">=" + num2);
//		}
//
//		if (num1 == num2) {
//			System.out.println(num1 + "=" + num2);
//		}

		// exercise 33

//		System.out.print("Enter an integer");
//		String nummer = sc.nextLine();
//		String[] split = nummer.split("");
//		int nummer1 = Integer.valueOf(split[0]);
//		int nummer2 = Integer.valueOf(split[1]);
//		System.out.println(nummer1 + nummer2);

		// exercise 36 snap ik niet

		// exercise 37

//		  String original = "Kijk wat ik kan, ik draai dit om oftewel in spiegelbeeld";
//	        StringBuilder reversed = new StringBuilder(original);
//	        reversed.reverse();
//	        System.out.println(reversed.toString());

		// exercise 38
//	    
//		System.out.println("Typ a sentence as you want:");
//		String input = sc.nextLine();
//		
//		int letters = 0, nummers = 0, spaties = 0, andereDingen = 0;
//
//        
//        for (int i = 0; i < input.length(); i++) {
//            char characters = input.charAt(i);
//
//            if (Character.isLetter(characters)) {
//                letters++;
//            } else if (Character.isDigit(characters)) {
//                nummers++;
//            } else if (Character.isWhitespace(characters)) {
//                spaties++;
//            } else {
//                andereDingen++;
//            }
//        }
//
//        
//        System.out.println("Letters: " + letters);
//        System.out.println("Numbers: " + nummers);
//        System.out.println("Spaces: " + spaties);
//        System.out.println("Other characters: " + andereDingen);

		// exercise 39

//		int count = 0;
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                for (int k = 1; k <= 4; k++) {
//                    if (i != j && j != k && i != k) {
//                        System.out.println(i + "" + j + "" + k);
//                       count++;
//                    }
//                }
//            }
//        }
//
//        System.out.println("Total number of the three-digit-number is " + count);
//    
//	}
//}

		// exercise 42

//		System.out.println("Enter your password: ");
//		String password = sc.next();
//		
//		System.out.println("Your password is: " + password);

		// exercise 43

//		System.out.println("Twinkle, twinkle, little star,");
//		System.out.println("      How I wonder what you are!");
//		System.out.println("	       Up above the world so high,");
//		System.out.println("           Like a diamond in the sky.");
//		System.out.println("Twinkle, twinkle, little star,");
//		System.out.println("      How I wonder what you are!");

		// exercise 50

		System.out.print("Divided by 3:\n");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print(i + ", ");
			}
		}

		System.out.print("\n\nDivided by 5:\n");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.print(i + ", ");
			}
		}

		System.out.print("\n\nDivided by 3 & 5:\n");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + ", ");
			}
		}

		sc.close();
	}
}
