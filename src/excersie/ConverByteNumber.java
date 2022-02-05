package excersie;

public class ConverByteNumber {
	static void byteNumbers(short a) {
		byte byteNumber = (byte) a;
		System.out.println("byte Number is: " + byteNumber);
	}
	

	public static void main(String[] args) {

		short shortNumber = 150;

		byteNumbers(shortNumber);
	}

}
