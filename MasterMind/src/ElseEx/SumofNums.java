
package ElseEx;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
//        int number = console.nextInt();
        int number;
        int wasaaa = 10;

        while (wasaaa != 0) {
            number = console.nextInt();
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number: ");
            wasaaa --;
        }

        System.out.println("The sum is " + sum);

    }
}
