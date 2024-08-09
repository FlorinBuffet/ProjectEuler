package p011_Largest_product_in_a_grid;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_011 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/p011_Largest_product_in_a_grid/data.txt");
		Scanner fScan = new Scanner(file);

		int[][] array = new int[30][30];

		int line = 5;

		while (fScan.hasNextLine()) {
			String lineText = fScan.nextLine();
			Scanner lScan = new Scanner(lineText);

			int row = 5;
			while (lScan.hasNextInt()) {
				array[line][row] = lScan.nextInt();
				row++;
			}
			line++;
			lScan.close();
		}
		fScan.close();

		int maxProduct = 0;

		for (int i = 5; i < array.length - 5; i++) {
			for (int j = 5; j < array.length - 5; j++) {
				int hleft = array[i][j - 3] * array[i][j - 2] * array[i][j - 1] * array[i][j];
				int hright = array[i][j + 3] * array[i][j + 2] * array[i][j + 1] * array[i][j];
				int vup = array[i - 3][j] * array[i - 2][j] * array[i - 1][j] * array[i][j];
				int vdown = array[i + 3][j] * array[i + 2][j] * array[i + 1][j] * array[i][j];

				int dupleft = array[i - 3][j - 3] * array[i - 2][j - 2] * array[i - 1][j - 1] * array[i][j];
				int ddownright = array[i + 3][j + 3] * array[i + 2][j + 2] * array[i + 1][j + 1] * array[i][j];
				int dupright = array[i - 3][j + 3] * array[i - 2][j + 2] * array[i - 1][j + 1] * array[i][j];
				int ddownleft = array[i + 3][j - 3] * array[i + 2][j - 2] * array[i + 1][j - 1] * array[i][j];

				maxProduct = Math.max(maxProduct, hleft);
				maxProduct = Math.max(maxProduct, hright);
				maxProduct = Math.max(maxProduct, vup);
				maxProduct = Math.max(maxProduct, vdown);
				maxProduct = Math.max(maxProduct, dupleft);
				maxProduct = Math.max(maxProduct, ddownright);
				maxProduct = Math.max(maxProduct, dupright);
				maxProduct = Math.max(maxProduct, ddownleft);
			}
		}
		System.out.println(maxProduct);
	}
}
