//22) Evaluate the following expression on paper and on program and understand the
//difference
//a+=a++ + ++a + -–a + a–-; when a=28

package excersie;

public class ArithmeticOperation2 {

	public static void main(String[] args) {
		int a = 28;

		a += a++ + ++a +-a + a--;
		System.out.println("The value is: " + a);

	}

}
