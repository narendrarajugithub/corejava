package com.napier.core;

public class VarablesDeclarations {
	public static int a=10;
	
	public int m1(){
		System.out.println(this.a);
		this.a=25;
		System.out.println(this.a);
		return this.a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hi");
		String s2="hi";
		String s4="hi";
		String s3=new String("hi");
		//System.out.println(s.intern()==s2.intern());
		/*VarablesDeclarations obj=new VarablesDeclarations();
		obj.m1();
*/		//s.intern();
		
		System.out.println(s2==s4);
		System.out.println(s2.hashCode());
		
		/*int i;
		i='c';
		char a;
		a=99;
		//here i takes the ASCII value of the character
		System.out.println(i);
		here a is character because of this when the the corresponding ASCII value is converted into character
		System.out.println(a);
		
		byte a1=1;
		int a2=a1;
		int a3=10;
		float a4=12;
		double a5=a4;
		System.out.println(a5);*/
		
		
		

	}

}
