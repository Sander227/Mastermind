import java.util.Scanner;

public class Chickens02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many eggs were laid on day 1");
		int day1 = sc.nextInt();

		System.out.println("How many eggs were laid on day 2");
		int day2 = sc.nextInt();

		System.out.println("How many eggs were laid on day 3");
		int day3 = sc.nextInt();

		double dailyAverage = (day1 + day2 + day3) / 3.0;
		System.out.printf("Daily Average:   " + "%,.2f \n \n", dailyAverage);

		double monthlyAverage = dailyAverage * 30;
		System.out.printf("Monthly Average: " + "%,.2f \n \n", monthlyAverage);

		double monthlyProfit = monthlyAverage * 0.18;
		System.out.printf("Monthly Profit:  $" + "%,.2f \n \n", monthlyProfit);

		sc.close();
	}

}
