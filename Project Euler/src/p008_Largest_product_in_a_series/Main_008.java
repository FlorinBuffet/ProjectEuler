package p008_Largest_product_in_a_series;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_008 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/p008_Largest_product_in_a_series/data.txt");
		Scanner in = new Scanner(file);

		long maxProduct = 0;

		while (in.hasNextLine()) {
			String line = in.nextLine();
			int[] array = new int[line.length()];

			for (int i = 0; i < array.length; i++) {
				array[i] = line.charAt(i) - 48;
			}
			for (int i = 0; i < array.length - 12; i++) {
				long sum = 1;
				for (int j = 0; j < 13; j++) {
					sum = sum * array[i + j];
				}
				maxProduct = Math.max(maxProduct, sum);
			}
		}
		System.out.println(maxProduct);

	}

}
