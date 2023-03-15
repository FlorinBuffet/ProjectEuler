package p020_Factorial_digit_sum;

import java.math.BigInteger;

public class Main_020 {

	public static void main(String[] args) {
		BigInteger factorial = BigInteger.ONE;

		for (int i = 1; i <= 100; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		long sum = 0;
		for (int i = 0; i < factorial.toString().length(); i++) {
			sum += factorial.toString().charAt(i) - 48;
		}
		System.out.println(sum);
	}
}
