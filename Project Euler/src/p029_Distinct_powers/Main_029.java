package p029_Distinct_powers;

import java.math.BigInteger;
import java.util.HashSet;

import Helpers.Helper_Numbers;

public class Main_029 {

	public static void main(String[] args) {
		int limit = 100;
		
		HashSet<BigInteger> results = new HashSet<BigInteger>();
		for (int i = 2; i<=limit; i++) {
			for (int j = 2; j<=limit; j++) {
				results.add(Helper_Numbers.pow(i, j));
			}
		}
		System.out.println(results.size());
	}
}
