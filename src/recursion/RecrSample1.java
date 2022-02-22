package recursion;

public class RecrSample1 {

	public static int error(int a) {

		if (a <= 0)
			return a;
		
		return error(a - 1) + error(a - 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(error(6));

	}

}
