package com.employee_management_application;
import java.sql.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int id;
		double new_salary;
		
		EmployeeDaoInterface dao = new EmployeeDaoImpl();
		
		
		   Scanner sc =new Scanner(System.in);
		   System.out.println("------ Enter Your Login Credentials ------");
		   System.out.println("Enter your UserName:");
		   String userName=sc.nextLine();
		 
		   System.out.println("Enter your Password:");
		   String password=sc.nextLine();
		   
		   if(userName.equals("admin")&&password.equals("admin")) 
		   {
			   System.out.println("Checking... & Verifying........");
			   System.out.println("..........................");
			   System.out.println("Checked & Verified\n");
			   int choice;   
			   
			   
		do {
			
			System.out.println("**********Welcome To Employee Management Application**********\n");
		
			System.out.println("Press 1: To Add The Employee Details\n" +
		           "Press 2: To Show All The Employee Details\n" +
				   "Press 3: To Show The Employee Details Based On Id\n" +
		           "Press 4: To Update the Employee Details\n" +
				   "Press 5: To Delete the Employee Details\n" +
		           "Press 6: To Exit the Application\n");
			
			System.out.println("Please Enter Your Choice :");
			
			 choice = sc.nextInt();
			switch(choice) {
			       case 1:
			    	   
			    	   Employee emp = new Employee();
			    	   
			    	   System.out.println("Please Enter Employee Id :");
			    	    id = sc.nextInt();
			    	   System.out.println("Please Enter Employee Name :");
			    	    String name = sc.next();
			    	   System.out.println("Please Enter Employee Age :");
			    	    int age = sc.nextInt();
			    	   System.out.println("Please Enter Employee Contact :");
			    	    String contact = sc.next();
			    	   System.out.println("Please Enter Employee Gender :");
			    	    String gender = sc.next();
			    	   System.out.println("Please Enter Employee Salary :");
			    	    double salary = sc.nextDouble();
			    	   System.out.println("Please Enter Employee Department :");
			    	    String department = sc.next();
			    	   System.out.println("Please Enter Employee Hiredate(YYYY-MM-DD) :");
			    	    String s = sc.next();
						Date hiredate= Date.valueOf(s);
			
			    	    
			    	   
			    	   emp.setId(id);
			    	   emp.setName(name);
			    	   emp.setAge(age);
			    	   emp.setContact(contact);
			    	   emp.setGender(gender);
			    	   emp.setSalary(salary);
			    	   emp.setDepartment(department);
			    	   emp.setHiredate(hiredate);
				        dao.createEmployee(emp);
				        break;
				        
				   case 2:
					   
					    dao.showAllEmployee();
					    break;
					    
				   case 3:
					   
					   System.out.println("Enter Id To Show The Employee Details :");
					    id = sc.nextInt();
					   dao.showEmployeeBasedOnId(id);
					   break;
				   
				   case 4:
					   

					   System.out.println("Enter Id To Update the Employee Details :");
					    id = sc.nextInt();
					   System.out.println("Enter The New Name :");
					   String new_name=sc.next();
					   System.out.println("Enter The New Contact :");
					   String new_contact=sc.next();
					   System.out.println("Enter The New Gender :");
					   String new_gender=sc.next();
					   System.out.println("Enter The New Salary :");
					   new_salary=sc.nextDouble();
					   dao.updateEmployee(id,new_name,new_contact,new_gender,new_salary);
					   break;
					   
				   case 5:
					   
					   System.out.println("Enter Id To Delete the Employee Details :");
					   id=sc.nextInt();
					   dao.deleteEmployee(id);
					   break;
					   
				  case 6:   
					   
					   System.out.println("Thank You For Using Our Application !!!");
					   System.exit(0);
					   
				  default:
					  
					  System.out.println("Enter Valid Choice !");
					  break;
			}
		}while(choice!=0);

	}
		   else if (!(userName.equals("admin"))&&(!(password.equals("admin"))))
		   {
			   System.out.println("------ Enter Valid Credentials ------");
		   } 
		   
		   else if (!userName.equals("admin"))
		   {
			   System.out.println("------ Invalid UserName -----");
		   } 
		   else if (!password.equals("admin"))
		   {
			   System.out.println("------ Invalid Password ------ ");
		   } 
		   
		   sc.close();
		   

        }
}
