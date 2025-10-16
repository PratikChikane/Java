package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCrudDemo {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeService eservice = new EmployeeServiceImpl();
	eservice.readFile("empdata1.txt");
	int choice = 0;
	
	do {
		System.out.println("1.Add new Employee \n2.delete by id");
		System.out.println("3.modify by id \n4.display all \n5.display by id \n6.exit  ");
		choice = sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status = eservice.addNewEmployee();
			if(status) {
				System.out.println("Employee added succefully");
			}else {
				System.out.println("Not Added");
			}
		}
		
		case 2->{
			System.out.println("Enter id for delete");
			int id = sc.nextInt();
			boolean status = eservice.deleteById(id);
			if(status) {
				System.out.println("Deleted successfully");
			}else {
				System.out.println("Not found");
			}
		}
		case 3->{
			System.out.println("Enter id for modify");
			int id = sc.nextInt();
			System.out.println("Enter new Salary");
			double sal = sc.nextDouble();
			boolean status = eservice.modifyById(id,sal);
			if(status) {
				System.out.println("modified successfully");
			}else {
				System.out.println("Not Found");
			}
		}
		case 4->{
			List<Employee> list=eservice.getAll();
			list.forEach(System.out::println);
		}
		case 5->{
			System.out.println("Enter id");
			int empid=sc.nextInt();
			Employee ob=eservice.getById(empid);
			if(ob!=null) {
				System.out.println(ob);
			}else {
				System.out.println("not found");
			}
		}
		case 6->{
			eservice.writeToFile("empdata1.txt");
			sc.close();
			System.out.println("Thank you for visiting......");
		}
		}
	}while(choice !=6);
}
}
