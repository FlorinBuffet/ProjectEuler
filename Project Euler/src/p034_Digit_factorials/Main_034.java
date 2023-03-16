package p034_Digit_factorials;

public class Main_034 {

	public static void main(String[] args) {
		long sum = 0;

		for (int i = 3; i < 10000000; i++) {
			sum += isValid(i) ? i : 0;
		}
		System.out.println(sum);
	}

	public static boolean isValid(int num) {
		int sum = 0;
		String number = num + "";

		for (int i = 0; i < number.length(); i++) {
			sum += factorial(number.charAt(i) - 48);
		}
		return sum == num;
	}

	public static int factorial(int num) {
		int sum = 1;
		for (int i = num; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}

}
