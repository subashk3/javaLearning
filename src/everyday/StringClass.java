//String is Non-primitive datatype
//String is special class
//String is immutable 

package everyday;

public class StringClass {

	public static void main(String[] args) {
		// Object declaration in heap memory
		
		String s1 = new String("Hello this first Program from String");

		// literal declaration in String Constant Pool memory
		
		String s2 = " don't judge a book by its cover ";

		/* String methods; */

		// lenth() - calculate length
		// System.out.println(s1.length());

		// isBlank() - return boolean value
		// s2 = " ";
		// System.out.println(s2.isBlank());

		// isEmpty(); -return boolean value
		// s2 = " ";
		// s2 = "";
		// System.out.println(s2.isEmpty());

		// equals() - return boolean value
		// System.out.println(s2.equals(s1));

		/* String searching methods */

		// indexOf();
//		System.out.println("Frist char index"+s1.indexOf('a'));
//		System.out.println(s1.indexOf("this"));

		// charAt(index);
		// System.out.println(s2.charAt(5));

		// substring(index);
		// System.out.println(s2.substring(2));
		// System.out.println(s2.substring(2, 6));

		// strp() - Unicode support
		// System.out.println(s2.strip());

		// trim() - Unicode not support

		// System.out.println(s2.trim());

		// Repeat(count)
		// System.out.println(s2.repeat(5));

		// toUpperCase() toLowerCase()
//		s2 = "aBcde";
//		System.out.println(s2.toLowerCase()+ " " +s2.toUpperCase());
		
		
		

	}

}
