package com.demo.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourseMgntSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CourseService cservice = new CourseServiceImpl();
        int choice = 0;
        do {
        	System.out.println("1. Add new Course \n 2.display all \n3.find by course name \n");
        	System.out.println("4.modify course capacity \n5.find by course capacity\n6. modify course name\n");
        	System.out.println("7.display in sorted of key \n8.display order of value\n");
        	System.out.println("9.delete by course name \n10. delete by capacity \n11.exit\n choice");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 1->{
        		boolean status= cservice.addNewCourse();
        		if(status) {
        			System.out.println("new course added");
        		}else {
        			System.out.println("duplicate name");
        		}
        	}
        	case 2 ->{
        		Map<String, Integer> cmap=cservice.displayAll();
        		Set<String> keys = cmap.keySet();
        		keys.forEach(e->System.out.println(e+"----->"+cmap.get(e)));
        	}
        	case 3 ->{
        		System.out.println("Enter Course Name");
        		String cname = sc.next();
        		int capacity = cservice.searchByName(cname);
        		if(capacity!=-1) {
        			System.out.println("CourseName: "+cname+"Capacity: "+capacity);
        		}else {
        			System.out.println("Not Found");
        		}
        	}
        	case 4->{
        		System.out.println("Modify Course name");
        		String cname = sc.next();
        		System.out.println(" Enter Course New Capacity ");
        		int newcap= sc.nextInt();
        		boolean status = cservice.modifyByName(cname,newcap);
        		if(status) {
        			System.out.println("Modification done ");
        		}else{
        			System.out.println("Not Found");
        		}
        	}
        	case 5->{
        		System.out.println("enter course capacity");
        		int capacity = sc.nextInt();
        		Set<String> cset = cservice.displayByCapacity(capacity);
        		if(cset!=null) {
        			cset.forEach(System.out::println);
        		}
        		else {
        			System.out.println("Not Found");
        		}
        	}
        	case 6->{
        		System.out.println("modify course name");
        		String oname = sc.next();
        		System.out.println("Enter new Course Name");
        		String nname = sc.next();
        		boolean status = cservice.modifyCourseName(oname,nname);
        		if(status) {
        			System.out.println("Modification done");
        		}else {
        			System.out.println("not found");
        		}
        	}
        	case 7->{
        		
        	}
        	default->{
        		System.out.println("Wrong Choice");
        	}
        	}
        }while(choice!=11);
	}

}
