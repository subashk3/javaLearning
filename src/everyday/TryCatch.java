package everyday;

public class TryCatch {

	public static void main(String[] args) {

		int firstNum = 10, secondNum = 0;

		int divNum = 1;

		// divNum = firstNum / secondNum;

		try {
			divNum = firstNum / secondNum;

		} catch (ArithmeticException e) { 

			System.out.println(e.getMessage());
		}

		System.out.println(divNum);
		System.out.println("End of try-catch");

	}

}
