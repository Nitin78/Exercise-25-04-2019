package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class DaoClass implements DaoInterface {
	private Map<Integer,Employee> nn= new HashMap<Integer,Employee>();
	@Override
	public void storeIntoMap(Employee em) {
	
		nn.put(em.getId(), em);
		
	}
//	public DaoClass()
//	  {  
//	nn.put(1,new Employee(1,"Nitin","Developer",3000));
//	 }
	public Map<Integer,Employee>displayName(){
		return nn;
		
		
	}
}
