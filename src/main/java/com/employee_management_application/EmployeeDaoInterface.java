package com.employee_management_application;

public interface EmployeeDaoInterface {
	
	//create employee
	public void createEmployee(Employee emp);
	//show all employee
	public void showAllEmployee();
	//show employee based on id
	public void showEmployeeBasedOnId(int id);
	//update employee
	public void updateEmployee(int id,String new_name,String new_contact,String new_gender,double new_salary);
	//delete employee
	public void deleteEmployee(int id);
	

}
