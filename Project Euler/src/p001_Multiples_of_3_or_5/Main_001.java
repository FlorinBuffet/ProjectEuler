package p001_Multiples_of_3_or_5;

public class Main_001 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if ((i % 3) == 0 || (i % 5) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
