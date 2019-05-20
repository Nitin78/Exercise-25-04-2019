package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface DaoInterface {
void storeIntoMap(Employee em);
Map<Integer,Employee> displayName();
}
