package com.test;
// Method Overloading 
class FirstClass {
	public void firstPrint() {
		System.out.println("Without parameter. ");
	}
}
class SecondClass extends FirstClass {
	public void firstPrint(String s) {
		System.out.println("With parameter. "+s);
	}
}
public class PloyOverload {
	public static void main(String[] args) {

		SecondClass obOverload = new SecondClass();		
		obOverload.firstPrint();		
		obOverload.firstPrint("Name");
		
		
	}

}
