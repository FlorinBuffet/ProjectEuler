package p027_Quadratic_primes;

import Helpers.Helper_Numbers;

public class Main_027 {
	public static void main(String[] args) {
		int maxA = 0;
		int maxB = 0;
		int maxP = 0;

		for (int a = -999; a < 1000; a++) {
			for (int b = -999; b < 1000; b++) {

				int counter = 0;
				while (true) {
					if (!Helper_Numbers.isPrime((int) Math.pow(counter, 2) + (a * counter) + b))
						break;
					counter++;
				}
				if (maxP < counter) {
					maxP = counter;
					maxA = a;
					maxB = b;
				}
			}
		}
		System.out.println(maxA * maxB);
	}
}
