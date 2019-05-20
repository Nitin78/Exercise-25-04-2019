package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {
	
	void storeIntoMap(Employee emp);
	
	Map<Integer,Employee> displayName();
	void getPolicy(Employee em);
}