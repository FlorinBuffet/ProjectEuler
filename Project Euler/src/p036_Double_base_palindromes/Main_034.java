package p036_Double_base_palindromes;

import Helpers.Helper_Strings;

public class Main_034 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<1000000; i++) {
			if (Helper_Strings.isPalindrome(i+"") && Helper_Strings.isPalindrome(Integer.toBinaryString(i)))
				sum += i;
		}
		System.out.println(sum);
	}
}
