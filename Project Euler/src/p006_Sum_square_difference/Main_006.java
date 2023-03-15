package p006_Sum_square_difference;

public class Main_006 {

	public static void main(String[] args) {
		long sum = 0;
		long squareSum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
			squareSum += i * i;
		}

		System.out.println(sum * sum - squareSum);

	}

}
