package p016_Power_digit_sum;
import java.math.BigInteger;

public class Main_016 {

	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(2);

		for (int i = 0; i < 1000; i++) {
			number = number.multiply(two);
		}

		String num = number.toString();

		long sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += num.charAt(i) - 48;
		}
		System.out.println(sum);
	}
}
