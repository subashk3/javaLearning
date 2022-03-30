package surprise;

public class Fibonacci {
//Check Prime number or not
	public boolean checkPrime(int a) {
		boolean isPrime = true;
		if (a == 1 || a == 0) {
			return false;
		}
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			return true;
		else {
			return false;
		}

	}
// Print fibonacci Number
	public void printFibonacci() {
		int count = 0;
		int firstNumber = 0;
		int secondNumber = 1;
		while (count < 10) {
			if (checkPrime(firstNumber)) {
				System.out.print(firstNumber + " ");
				count++;
			}
			int swapValues = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = swapValues;
		}
	}
	public static void main(String[] args) {
		Fibonacci oFibonacci = new Fibonacci();
		oFibonacci.printFibonacci();
	}

}
