package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeService;
import com.ibm.eis.service.EmployeeServiceClass;


public class Main {
public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Employee em = new Employee();
		EmployeeServiceClass service=new EmployeeServiceClass();
		System.out.print("Enter ID:");
		  int id=scan.nextInt();
		  em.setId(id);		  
		  scan.nextLine();
		  System.out.print("Enter Name:");
		  em.setName(scan.nextLine());
		  System.out.print("Enter Designation:");
		  em.setdesignation(scan.nextLine());
		  System.out.print("Enter Salary:");
		  em.setSalary(scan.nextInt());
		  scan.nextLine();
		  service.getPolicy(em);
		  service.storeIntoMap(em);
		  System.out.println(service.displayName());
		  
}
}