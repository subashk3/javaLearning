package everyday;

interface InterfaceDemo{
	public int cal(int a, int b);
}
public class LambdaMethod {

	public static void main(String[] args) {
		
		//lambda functions
		InterfaceDemo reDemo = (int a, int b)-> a+b;
		
		System.out.println(reDemo.cal(5, 25));

	}

}
