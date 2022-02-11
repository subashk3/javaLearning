/*
aqurires all the properties and behavious from parents class
Type of Iheritance 
1. Single 
2.Multilevel 
3.Hierarchical 
4.Multiple (Not support in java)
5.Hybrid
*/
package oops;

public class Inheritance {

	public static void main(String[] args) {
		//Only access A class
		InheritanceClassA obj1 = new InheritanceClassA();
		obj1.methodA();
		
		//Only access A class and B class
		InheritanceClassB obj2 = new InheritanceClassB();
		obj2.methodA();
		obj2.methodB();
		//Only access A class and B class
		InheritanceClassC obj3 = new InheritanceClassC();
		obj3.methodA();
		obj3.methodB();
		obj3.methodC();
		
		
	}

}
