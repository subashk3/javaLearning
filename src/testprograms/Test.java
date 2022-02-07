package testprograms;

class Ajith {

	public void subash(int a, int b) {

		System.out.println("sum " + (a + b));
	}
}

public class Test {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		int a[] = new int[10];

		Ajith obj = new Ajith();
		

		int s = 10;

		int b = 20;

		obj.subash(s, b);  // obj.subash(10,20);
		
		
	}

}
