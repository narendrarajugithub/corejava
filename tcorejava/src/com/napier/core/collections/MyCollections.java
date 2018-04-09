package com.napier.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

import com.napier.core.comparator.impl.Employee;
import com.napier.core.comparator.impl.EmployeeComparator;

public class MyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//THIS LINE IS ADDED BY SIVA
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(2);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	
		ArrayList<Employee> ea=new ArrayList<Employee>();
		Employee emp,emp2,emp3 = null;
		emp=new Employee();
		emp.no=15;
		emp.name="kalyan";
		emp2=new Employee();
		emp2.no=11;
		emp2.name="ramu";
		emp3 =new Employee();
		emp3.no=20;
		emp3.name="kiran";
		//TreeSet<Employee> Ale=new TreeSet<Employee>();;
		
		ea.add(emp);
		ea.add(emp2);
		ea.add(emp3);
		
		Collections.sort(ea,new EmployeeComparator());
		Iterator<Employee> yle=	ea.iterator();
		
		while(yle.hasNext()){
		Employee e=	yle.next();
		System.out.print(e.no+"\t");
		System.out.print(e.name);
		System.out.println();
			
		}
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("za");
		
		ts.add("ab");
		ts.add("bc");
		ts.add("ac");
		System.out.println(ts);
		
		
		

	}

}
