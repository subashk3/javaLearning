/*21) Evaluate the following expression on paper and on program and understand the
difference
i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2*/

package excersie;

public class ArithmeticOperation {

	public static void main(String[] args) {

		int a = 10, b = 5;

		System.out.println("++a-b– = " + (++a - b--));
		a = 10; b = 5;
		System.out.println("a%b++ = " + (a % b++));
		
		 a = 10; b = 5;
		System.out.println("a*=b+5 = " + (a *= b + 5)); // Equal to last priority 
		

		int x = 69 >>> 2;
		System.out.println("x=69>>>2 = " + x);

	}

}
