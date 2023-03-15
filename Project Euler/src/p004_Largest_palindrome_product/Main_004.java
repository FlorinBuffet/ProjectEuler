package p004_Largest_palindrome_product;

public class Main_004 {

	public static void main(String[] args) {

		for (int i = 999; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				if (isPalindrome(i * j)) {
					System.out.println(i * j);
					System.exit(0);
				}
			}
		}
	}

	public static boolean isPalindrome(int i) {
		String value = i + "";
		while (value.length() > 1) {
			if (value.charAt(0) == value.charAt(value.length() - 1))
				value = value.substring(1, value.length() - 1);
			else
				return false;
		}
		return true;
	}
}
