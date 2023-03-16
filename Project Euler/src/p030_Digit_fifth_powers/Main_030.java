package p030_Digit_fifth_powers;

public class Main_030 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 10000000; i++) {
			sum += isValid(i) ? i : 0;
		}
		System.out.println(sum);
	}

	public static boolean isValid(int num) {
		String number = num + "";
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Math.pow(number.charAt(i) - 48, 5);
		}
		return sum == num;
	}
}
