package com.firstprogram.program;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Child();
		p1.m1(); // prints child class m1
		p1.m2(); // prints parent class m2
		// p1.m3(); cannot call m3 because it is not an overridden method
	}
	
	public void m1() {
		System.out.println("Child class m1");
	}
	
	public void m3() {
		System.out.println("Child class m3");
	}
}
