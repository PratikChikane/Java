package com.demo.service;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {
	private CourseDao cdao;
	
	
	public CourseServiceImpl() {
		super();
		this.cdao =new CourseDaoImpl();
	}


	@Override
	public boolean addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Name");
		String cname = sc.next();
		System.out.println("enter capacity");
		int capacity = sc.nextInt();
		return cdao.save(cname, capacity);
	}


	@Override
	public Map<String, Integer> displayAll() {
		return cdao.findAll();
	}


	@Override
	public int searchByName(String cname) {
		return cdao.findByName(cname);
	}


	@Override
	public boolean modifyByName(String cname, int newcap) {
		
		return cdao.updateByname(cname, newcap);
	}


	@Override
	public Set<String> displayByCapacity(int capacity) {
		return cdao.findByCapacity(capacity);
	}


	@Override
	public boolean modifyCourseName(String oname, String nname) {
		
		return cdao.updateCourseName(oname,nname);
	}

	
	

}
