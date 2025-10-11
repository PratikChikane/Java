package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {
public static void main(String []args) {
	
	Scanner sc = new Scanner(System.in);
	EmployeeService eservice = new EmployeeServiceImpl();
	int choice =0;
	do {
		System.out.println("1. Add new employee \n2. display all \n3.search by id");
		System.out.println("4.search by Name \n5.update Salary \n6. delete by id \n7. delete by Salary" );
		System.out.println("8.search by salary \n9. sort by salary \n10. Sort By Name \11. sort by id \n12. exit\n choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1->{
			boolean status = eservice.addNewemployee();
			if(status) {
				System.out.println("Added Successfully.");
			}else {
				System.out.println("duplicate id , not allowed");
			}
		}
		
		case 2->{
			Set<Employee> eset = eservice.displayAll();
			eset.forEach(System.out::println);
		}
		case 3->{
			System.out.println("Enter id");
			int id = sc.nextInt();
			Employee e = eservice.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println("Not Found");
			}
		}
		case 4->{
			System.out.println("Enter Name: ");
			String nm = sc.next();
			Set<Employee> eset = eservice.displayByName(nm);
			if(eset!=null) {
				eset.forEach(System.out::println);
			}else{
				System.out.println("Not Found");
			}
		}
		
		case 5->{
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter Salary");
			double Sal = sc.nextDouble();
			
			boolean status= eservice.updateSalary(id,Sal);
			if(status) {
			System.out.println("Updated Successfully");
			}else {
				System.out.println("Not Found");
			}
			
		}
		
		case 6->{
    		System.out.println("Enter id for delete");
    		int eid =sc.nextInt();
    		boolean status =eservice.deleteById(eid);
    		if(status) {
    			System.out.println("Deleted Successfully");
    		}else {
    			System.out.println("Not Found");
    		}
    	}
		case 7->{
			System.out.println("Enter Salary to delete");
			double sal = sc.nextDouble();
			boolean status = eservice.deleteBySal(sal);
			if(status) {
				System.out.println("Salary deleted successfully");
			}else {
				System.out.println("Salary Not Found");
			}
		}
		case 8->{
			System.out.println("Enter sal to search");
			double sal = sc.nextDouble();
			Set<Employee> e = eservice.searchBySal(sal);
			if(e!=null) {
    			e.forEach(System.out::println);
    		}
    		else {
    			System.out.println("Not Found");
    		}
    		
		}
		case 9->{
			List<Employee> e = eservice.sortBySal();
			e.forEach(System.out::println);
		}
		case 10->{
			List<Employee> e = eservice.sortByName();
			e.forEach(System.out::println);
		}
		case 11->{
			Set<Employee> e=eservice.sortById();
			e.forEach(System.out::println);
		}
		}
	}while(choice !=12);
}
}
