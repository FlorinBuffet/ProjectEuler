package Helpers;

public class Helper_Strings {

	public static boolean isPalindrome(String value) {
		while (value.length() > 1) {
			if (value.charAt(0) == value.charAt(value.length() - 1))
				value = value.substring(1, value.length() - 1);
			else
				return false;
		}
		return true;
	}

}
