package p009_Special_Pythagorean_triplet;

public class Main_009 {

	public static void main(String[] args) {

		int result = 1000;

		for (int a = 1; a < result; a++) {
			for (int b = a; b < result; b++) {
				int c = result - a - b;
				if (c * c == a * a + b * b) {
					System.out.println(a * b * c);
				}
			}
		}

	}

}
