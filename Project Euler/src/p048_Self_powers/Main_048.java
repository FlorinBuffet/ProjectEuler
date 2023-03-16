package p048_Self_powers;

import java.math.BigInteger;

import Helpers.Helper_BigInteger;

public class Main_048 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(Helper_BigInteger.pow(i, i));
		}
		System.out.println(sum);
	}
}
