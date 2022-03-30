package com.test;

public class MainClass implements InterfaceA {

	public static void main(String[] args) {
		MainClass objClass = new MainClass();
		objClass.printA();
		objClass.printB();
		objClass.printC();
	}
	@Override
	public void printB() {
		System.out.println("This is print B Interface");

	}

	@Override
	public void printA() {
		System.out.println("This is print A Interface");

	}

	@Override
	public void printC() {
		System.out.println("This is print C Interface");

	}

}
