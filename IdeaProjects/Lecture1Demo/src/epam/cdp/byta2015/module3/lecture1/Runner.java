package epam.cdp.byta2015.module3.lecture1;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		boolean isRepeat = true;

		while (isRepeat) {

			System.out.println("Please, enter number of menu:");
			System.out.println("1 - Summ");
			System.out.println("2 - Factorial");
			System.out.println("0 - Exit");

			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();

			switch (action) {
			case 0:
				isRepeat = false;
				System.out.println("Completed");
				break;

			case 1:
				int toValueSumm;
				System.out.println("Please, enter N: ");
				toValueSumm = scanner.nextInt();
				MathUtils math1 = new MathUtils(toValueSumm);
				System.out.println("Summ = " + math1.summ());
				break;

			case 2:
				int toValueFactorial;
				System.out.println("Please, enter N: ");
				toValueFactorial = scanner.nextInt();
				MathUtils math2 = new MathUtils(toValueFactorial);
				System.out.println("Factorial = " + math2.factorial());
				break;

			default:
				System.out.println("Incorrect value! Please, try again.");
				break;
			}

		}

	}

}
