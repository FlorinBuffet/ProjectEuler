package p005_Smallest_multiple;

public class Main_005 {

	public static void main(String[] args) {
		long number = 1;
		for (int i = 1; i <= 20; i++) {
			number = slow(i, number);
			System.out.println("Up To: " + i + "  Result: " + number);
		}
	}

	public static long slow(int upTo, long number) {
		while (true) {
			for (int i = 1; i <= upTo; i++) {
				if (number % i != 0)
					break;

				if (i == upTo) {
					return number;
				}
			}
			number++;
		}
	}
}
