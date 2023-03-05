package com.employee_management_application;

import java.sql.Date;

public class Employee {
		
	private int id;
	private String name;
	private int age;
	private String contact;
	private String gender;
	private double salary;
	private String department;
	private Date hiredate;
	
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, String contact, String gender, 
			double salary, String department,Date hiredate) {
		
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
		this.hiredate = hiredate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + ", gender="
				+ gender + ", salary=" + salary + ", department=" + department + ", hiredate=" + hiredate + "]";
   }
}
	
	
