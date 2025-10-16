package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao edao;

	public EmployeeServiceImpl() {
	super();
	this.edao = new EmployeeDaoImpl();
}

	@Override
	public void readFile(String fname) {
		edao.readData(fname);
		
	}

	@Override
	public boolean addNewEmployee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int empid=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter desg");
		String desg=sc.next();
		System.out.println("Enter sal");
		double sal=sc.nextDouble();
		Employee e=new Employee(empid,nm,desg,sal);
		return edao.save(e);
		
	}

	@Override
	public boolean deleteById(int id) {
		
		return edao.removeById(id);
	}

	@Override
	public boolean modifyById(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.updateById(id,sal);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return edao.findById(empid);
	}

	@Override
	public void writeToFile(String fname) {
		// TODO Auto-generated method stub
		edao.writeData(fname);
	}

}
