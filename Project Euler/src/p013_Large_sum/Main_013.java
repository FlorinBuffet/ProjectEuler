package p013_Large_sum;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main_013 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/p013_Large_sum/data.txt");
		Scanner in = new Scanner(file);

		BigInteger sum = BigInteger.valueOf(0);

		while (in.hasNextLine()) {
			sum = sum.add(in.nextBigInteger());
		}

		System.out.println(sum);
	}

}
