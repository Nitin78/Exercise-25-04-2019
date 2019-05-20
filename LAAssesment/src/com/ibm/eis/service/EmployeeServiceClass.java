package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.DaoClass;
public class EmployeeServiceClass implements EmployeeService{
DaoClass dao = new DaoClass();
Employee em =new Employee();
public  void getPolicy(Employee em) {
	//em=dao.displayName().get(id);
	//System.out.println(dao.displayName());
	if((em.getSalary()>5000 && em.getSalary()<20000))
     em.setIScheme("Scheme C");
	else if((em.getSalary()>=20000 && em.getSalary()<40000))
	     em.setIScheme("Scheme B");
	else if((em.getSalary()>=40000))
	     em.setIScheme("Scheme A");
	else 
		em.setIScheme("No Scheme");
}
	
public void storeIntoMap(Employee name){
		dao.storeIntoMap(name);
		
	}

	public Map<Integer, Employee> displayName() {
		
		return dao.displayName();
	}





}
