package p014_Longest_Collatz_sequence;

public class Main_014 {

	public static void main(String[] args) {
		int max = 0;
		int maxNumber = 0;

		for (int i = 1; i < 1000000; i++) {
			int tmp = collatz(i);
			if (tmp > max) {
				max = tmp;
				maxNumber = i;
			}
		}
		System.out.println(maxNumber + ": " + max);
	}

	public static int collatz(long num) {
		int step = 0;
		while (num != 1) {
			step++;
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (3 * num) + 1;
			}
		}
		return step;
	}
}
