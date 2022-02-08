//56.Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
package excersie;

public class SumTwoPrime {

	public static void main(String[] args) {

//		System.out.println((checkPrime(7) ? "prime ella" : "prime"));
	}

	// checking prime or not
	static boolean checkPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				flag = true;
				break;

			}
		}

		return flag; //flase == prime number 
	}

//Checking Whether a Number can be Expressed as Sum of Two Prime Numbers

	static void sumOfPrime(int num) {
		
		boolean flag = false; 
		
		
		
	}
}
