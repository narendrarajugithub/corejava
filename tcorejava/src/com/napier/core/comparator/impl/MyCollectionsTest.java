package com.napier.core.comparator.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyCollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Employee> el=new ArrayList<Employee>();
		
		for(int i=0;i<4;i++){
		Employee e =new Employee();
		System.out.println("Name :");
		e.setName(s.nextLine());
		System.out.println("No:");
		e.setNo(Integer.parseInt(s.nextLine()));
			el.add(e);
		}
		System.out.println(el);
		for(Employee e: el){
			System.out.print(e.name+"\t");
			System.out.print(e.no+"\n");
		}
		Collections.sort(el,new Employee());
		System.out.println("---------------------------------------------");
		for(Employee e: el){
			System.out.print(e.name+"\t");
			System.out.print(e.no+"\n");
		}
		
	}

}
