
public class EmailValidator {

	/*
	 * Validation Rules There should be only 1-1 occurrences of "@" and "." Min 4
	 * letters before @ Min 3 letters between @ and . Min 2 letters after .
	 */
	public static void main(String[] args) {
		// String email = args[0];
		String email = "anamitra@gmail.com";
		int a = email.indexOf('@'), b = email.indexOf('.');
		if ((a > 3) && (b - a) >= 3 && (email.length() - (b + 1) >= 2) && (a == email.lastIndexOf('@'))
				&& (b == email.lastIndexOf('.'))) {
			System.out.println("Valid");
		} else
			System.out.println("Invalid");

	}

}
