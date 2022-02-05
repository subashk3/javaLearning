package excersie;

public class UnaryOperators {

	public static void main(String[] args) {

		int sumOfNums;

		sumOfNums = 10 - -11 + -12 + +25; // Unary combination plus and minus

		System.out.println(sumOfNums);

		// Increment operator

		int a =10;
		int postIncrement = a++;  //a =11 first assign then increment then value
		int preIncrement = ++a;  //a =12   first increment then assign then value
		System.out.println("Post Increatment a= " + postIncrement +", Pre Increatment a= " + preIncrement);
		
		
		System.out.println();
		// Decrement operator
		
		int b =10;
		int postDecrement = b--;  //b =9 first assign then Decrement then value
		int preDecrement = --b;  //b =8  first Decrement then assign then value
		System.out.println("Post Decrement b= " + postDecrement +", Pre Decrement b= " + preDecrement);
		
		System.out.println();
		//Logical Not operator
		boolean bln = true;
		System.out.println("With Out logical operator: " + bln);
		System.out.println();
		System.out.println("With logical operator: " + !bln);
		
	}

}
