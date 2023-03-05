package com.employee_management_application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDaoInterface {
	Connection con;

	@Override
	public void createEmployee(Employee emp) {
	      con = DbConnection.createDbConnection();
	      String query = "insert into employee (employee_id,employee_name,employee_age,employee_contact,employee_gender,employee_salary,employee_department,employee_hiredate) "
	      		+ "values(?,?,?,?,?,?,?,?)";
	      try {
	      PreparedStatement pstm = con.prepareStatement(query);
	      pstm.setInt(1,emp.getId());
	      pstm.setString(2,emp.getName());
	      pstm.setInt(3,emp.getAge());
	      pstm.setString(4,emp.getContact());
	      pstm.setString(5,emp.getGender());
	      pstm.setDouble(6,emp.getSalary());
	      pstm.setString(7,emp.getDepartment());
	      pstm.setDate(8,(Date) emp.getHiredate());
	      int count = pstm.executeUpdate();
	      if(count!=0) {
		    	  System.out.println("Employee Details Inserted Sucessfully !!!");
	
		      }else {
		    	  System.out.println("Employee Already Exists !!!");
		      }
		      System.out.println("---------------------------------------");
		      pstm.close();
		      con.close();
		  }
	    
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      
	}

	@Override
	public void showAllEmployee() {
		
		con = DbConnection.createDbConnection();
		String query = "select * from employee";
		System.out.println("Employee Details :");
		System.out.format("%s\t%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\n","Id","Name","Age","Contact","Gender","Salary","Department","Hiredate");
		System.out.println("----------------------------------------------------------------------------------------------------");
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%d\t%s\t%s\t%f\t%s\t%s\n",result.getInt(1),result.getString(2),result.getInt(3),
				                  result.getString(4),result.getString(5),result.getDouble(6),result.getString(7),result.getDate(8));
				System.out.println("----------------------------------------------------------------------------------------------------");
				
			}
			result.close();
			stmt.close();
			con.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showEmployeeBasedOnId(int id) {
		
		con = DbConnection.createDbConnection();
		String query = "select * from employee where employee_id ="+id;
		System.out.format("%s\t%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\n","Id","Name","Age","Contact","Gender","Salary","Department","Hiredate");
		System.out.println("----------------------------------------------------------------------------------------------------");
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%d\t%s\t%s\t%f\t%s\t%s\n",result.getInt(1),result.getString(2),result.getInt(3),
				                  result.getString(4),result.getString(5),result.getDouble(6),result.getString(7),result.getDate(8));
				
				System.out.println("----------------------------------------------------------------------------------------------------");
				
				
				
			}
			result.close();
			stmt.close();
			con.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

    @Override
	public void updateEmployee(int id, String new_name,String new_contact,String new_gender,double new_salary) {
		
		con = DbConnection.createDbConnection();
		String query ="update employee set employee_name=?,employee_contact=?,employee_gender=?,employee_salary=? where employee_id=?";
		try {
		      PreparedStatement pstm = con.prepareStatement(query);
		      pstm.setString(1,new_name);
		      pstm.setString(2,new_contact);
		      pstm.setString(3,new_gender);
		      pstm.setDouble(4,new_salary);
		      pstm.setInt(5,id);
		      int count = pstm.executeUpdate();
		      if(count!=0) {
		    	  System.out.println("Employee Details Updated Successfully !!!");

		      }else {
		    	  System.out.println("Failed To Update Employee Details !!!");
		      }
		      System.out.println("---------------------------------------");
		      pstm.close();
		      con.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    
    @Override
	public void deleteEmployee(int id) {
	    
		con = DbConnection.createDbConnection();
		String query ="delete from employee where employee_id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1,id);
			int count = pstm.executeUpdate();
		      if(count!=0) {
		    	  System.out.println("Employee Details Deleted Successfully !!!");
		      }else {
		    	  System.out.println("Failed To Delete Employee Details !!!");
		      }
		      System.out.println("---------------------------------------");
		      pstm.close();
		      con.close();
		      
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
   }

}
