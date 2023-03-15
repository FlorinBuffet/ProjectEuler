package p003_Largest_prime_factor;

public class Main_003 {

	public static void main(String[] args) {
		long findFactor = 600851475143L;

		while (findFactor % 2 == 0) {
			findFactor = findFactor / 2;
		}

		for (long i = 3; i <= findFactor / 2; i += 2) {
			while (findFactor % i == 0) {
				System.out.println(i);
				findFactor = findFactor / i;
			}
		}
		System.out.println("Result:" + findFactor);
	}
}
