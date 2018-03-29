package com.napier.core.comparator.impl;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		Integer res=new Integer(0);
		if(e1 instanceof Employee){
		res=(((Employee)e1).no<((Employee)e2).no)?-1:(((Employee)e1).no>((Employee)e2).no)? 1:0; 
		}else{
			try {
				throw new Employee("Not an Employee Type object");
			} catch (Employee e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return res;
	}


}
