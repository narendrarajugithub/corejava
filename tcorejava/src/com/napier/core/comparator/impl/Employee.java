package com.napier.core.comparator.impl;

import java.util.Comparator;

public class Employee extends Throwable implements Comparator<Employee> {
public String name;
public Integer no;
public Employee(){
	
}
	
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getNo() {
	return no;
}
public void setNo(Integer no) {
	this.no = no;
}
	public Employee(String msg){
		super(msg);
	}
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
