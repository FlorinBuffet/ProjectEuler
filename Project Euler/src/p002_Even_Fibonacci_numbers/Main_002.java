package p002_Even_Fibonacci_numbers;

public class Main_002 {

	public static void main(String[] args) {
		long sum = 0;

		long fib1 = 0;
		long fib2 = 1;

		while (fib2 <= 4000000) {
			long tmp = fib1 + fib2;
			fib1 = fib2;
			fib2 = tmp;
			if (tmp % 2 == 0) {
				sum += tmp;
			}
		}
		System.out.println(sum);
	}
}
