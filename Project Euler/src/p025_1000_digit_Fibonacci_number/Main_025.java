package p025_1000_digit_Fibonacci_number;

import java.math.BigInteger;

public class Main_025 {
	public static void main(String[] args) {
		int index = 2;

		BigInteger fib1 = BigInteger.valueOf(1);
		BigInteger fib2 = BigInteger.valueOf(1);

		while (fib2.toString().length() < 1000) {
			BigInteger tmp = fib1.add(fib2);
			fib1 = fib2;
			fib2 = tmp;
			index++;
		}
		System.out.println(index);
	}
}
