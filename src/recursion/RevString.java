package recursion;

public class RevString {

	public static void main(String[] args) {
		System.out.println(revString("Hello World"));
	}
	private static String revString(String string) {
		if (string.length() < 1)
			return string;
		return revString(string.substring(1)) + string.charAt(0);
	}

}
