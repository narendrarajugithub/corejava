package com.napier.core;

public class VarablesDeclarations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hi");
		
		s.intern();
		System.out.println(s.hashCode());
		System.out.println("hi".hashCode());
		
		int i;
		i='c';
		char a;
		a=99;
		//here i takes the ASCII value of the character
		System.out.println(i);
		/*here a is character because of this when the the corresponding ASCII value is converted into character*/
		System.out.println(a);
		
		byte a1=1;
		int a2=a1;
		int a3=10;
		float a4=12;
		double a5=a4;
		System.out.println(a5);
		
		
		

	}

}
