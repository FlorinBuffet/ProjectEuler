package p010_Summation_of_primes;

public class Main_010 {

	public static void main(String[] args) {
		boolean[] noPrime = new boolean[2000000];
		noPrime[0] = true;
		noPrime[1] = true;

		long primeSum = 0;

		for (int i = 2; i < noPrime.length; i++) {
			if (!noPrime[i]) {
				primeSum += i;
				int j = 2;
				while (j * i < noPrime.length) {
					noPrime[j * i] = true;
					j++;
				}
			}
		}
		System.out.println(primeSum);
	}
}
