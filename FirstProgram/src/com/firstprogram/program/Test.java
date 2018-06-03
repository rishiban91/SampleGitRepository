package com.firstprogram.program;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		Test test = new Test();
		test.concatanate(s1);
		System.out.println(s1);
	}
//-----------------------------------------------------------------------------	
	public void concatanate(String s1) {
		String s2="xyz";
		String result = s1.concat(s2);
		System.out.println(result);
	}
}
