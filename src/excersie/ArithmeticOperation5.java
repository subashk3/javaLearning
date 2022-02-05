/*25) Evaluate the following expression on paper and on program and understand the
difference
What is the value of x1 if x=5 ?
x1=++x – x++ + –x*/

package excersie;

public class ArithmeticOperation5 {

	public static void main(String[] args) {

		int x = 5;
		int x1 = ++x - x++ + -x;

		System.out.println("x1 = ++x - x++ + -x= "+ x1);
		
	}
}
