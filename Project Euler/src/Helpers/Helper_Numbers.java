package Helpers;

import java.math.BigInteger;

public class Helper_Numbers {
	public static BigInteger pow(BigInteger a, int b) {
		BigInteger sum = BigInteger.valueOf(1);
		for (int i = 1; i<=b; i++ ) {
			sum = sum.multiply(a);
		}
		return sum;
	}
	public static BigInteger pow(int a, int b) {
		BigInteger sum = BigInteger.valueOf(1);
		for (int i = 1; i<=b; i++ ) {
			sum = sum.multiply(BigInteger.valueOf(a));
		}
		return sum;
	}
}
