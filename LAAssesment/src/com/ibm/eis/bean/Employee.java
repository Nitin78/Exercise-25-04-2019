package com.ibm.eis.bean;

public class Employee {
 private int id;
Integer salary;
public Employee(int id, String Name, String designation, int salary){
	
}
public Employee()
{
	
}
 private String Name,designation,insuranceScheme;
 public void setName(String Name) {
	this.Name=Name; 
 }
 public void setdesignation(String designation) {
		this.designation=designation; 
	 }
 public void setIScheme(String insuranceScheme) {
		this.insuranceScheme=insuranceScheme; 
	 }
 public void setId(int id) {
		this.id=id; 
	 }
 public void setSalary(Integer i) {
		this.salary=i; 
	 }
 public String getName() {
	 return this.Name;
 }
 public String getdesignation() {
	 return this.designation;
 }
 public String getIScheme() {
	 return this.insuranceScheme;
 }
 public int getId() {
	 return this.id;
 }
 public Integer getSalary() {
	 return this.salary;
 }
 @Override
	public String toString() {
		return "Employee [name=" + Name + ", Salary=" + salary + ", Insurance Scheme=" + insuranceScheme + ", Designation=" + designation + "]";
	}
}
