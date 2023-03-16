package p004_Largest_palindrome_product;

import Helpers.Helper_Strings;

public class Main_004 {

	public static void main(String[] args) {

		for (int i = 999; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				if (Helper_Strings.isPalindrome(i * j+"")) {
					System.out.println(i * j);
					System.exit(0);
				}
			}
		}
	}
}
