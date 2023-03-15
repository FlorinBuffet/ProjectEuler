package p007_10001st_prime;

public class Main_007 {

	public static void main(String[] args) {
		boolean[] noPrime = new boolean[10000000];
		noPrime[0] = true;
		noPrime[1] = true;

		int primeFound = 0;

		for (int i = 2; i < noPrime.length; i++) {
			if (!noPrime[i]) {
				primeFound++;
				if (primeFound == 10001) {
					System.out.println(i);
					System.exit(0);
				}
				int j = 2;
				while (j * i < noPrime.length) {
					noPrime[j * i] = true;
					j++;
				}
			}
		}
	}
}
