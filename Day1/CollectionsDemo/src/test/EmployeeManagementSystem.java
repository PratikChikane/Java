package test;

import java.util.*;

import beans.Employee;
import service.EmployeeServiceImpl;
import service.EmployeeService;
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        EmployeeService eservice = new EmployeeServiceImpl();
        int choice =0;
        do {
        	System.out.println("1.add new employee\n 2. display all\n 3.search by id");
        	System.out.println("4.search by name\n 5. update sal\n 6.delete by id 7.delete by salary");
        	System.out.println("8.search by salary\n 9. sort by salary\n 10.Sort By Name\n 11.exit\n choice:");
        	choice=sc.nextInt();
        	
        	switch(choice) {
        	case 1 ->{
        		boolean status = eservice.addNewEmployee();
        		if(status) {
        			System.out.println("Added Successfully");
        		}
        		else {
        			System.out.println("Not found");
        		}
        	}
        	
        	case 2->{
        		List<Employee> elist = eservice.displayAll();
        		elist.forEach(System.out::println);
        	}
        	case 3->{
        		System.out.println("enter id for search");
        		int eid = sc.nextInt();
        		Employee e = eservice.searchById(eid);
        		if(e!=null) {
        			System.out.println(e);
        		}
        		else {
        			System.out.println("Not Found");
        		}
        	}
        	case 4->{
        		System.out.println("Enter name for searching");
        		String nm = sc.next();
        		List<Employee> elst = eservice.findByName(nm);
        		if(elst!=null) {
        			elst.forEach(System.out::println);
        		}else {
        			System.out.println("Not found");
        		}
        		
        	}
        	case 5->{
        		System.out.println("enter id for search");
        		int eid = sc.nextInt();
        		System.out.println("enter sal");
        		double sal = sc.nextDouble();
        		boolean status = eservice.updateById(eid, sal);
        		{
        			if(status) {
        				System.out.println("Updated Successfully");
        			}
        			else {
        				System.out.println("Not Found");
        			}
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
        		System.out.println("Enter salary");
        		double Sal = sc.nextDouble();
        		boolean status = eservice.deleteBySalary(Sal);
        		if(status) {
        			System.out.println("deleted successfully");
        		}else {
        			System.out.println("Not found");
        		}
        	}
        	
        	case 8->{
        		System.out.println("Enter Salary: ");
        		double sal = sc.nextDouble();
        		List<Employee> elist = eservice.searchBySal(sal);
        		if(elist!=null) {
        			elist.forEach(System.out::println);
        		}
        		else {
        			System.out.println("Not Found");
        		}
        		
        	}
        	
        	case 9->{
        		List<Employee> lst = eservice.sortBySal();
        		lst.forEach(System.out::println);
        	}
        	case 10->{
        		List<Employee> lst=eservice.sortByName();
				lst.forEach(System.out::println);
        	}
        	
        	case 11->{sc.close();
		     System.out.println("Thank ypu for visiting...."); 
		}
		default->{
			System.out.println("wrong choice");
		}
		}
		
	}while(choice!=11);

}

}