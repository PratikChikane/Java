package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeDao edao;
   
   public EmployeeServiceImpl() {
	   super();
	   this.edao=new EmployeeDaoImpl();
   }
	@Override
	public boolean addNewemployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Salary:");
		double Sal = sc.nextDouble();
		System.out.println("Enter date (dd/mm/yyyy");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(id,name,Sal,ldt);
		
		
		return edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		
		return edao.findAll();
	}
	@Override
	public Employee displayById(int id) {
		return edao.findById(id);
	}
	@Override
	public Set<Employee> displayByName(String nm) {	
	return edao.findByName(nm);
	}
	@Override
	public boolean updateSalary(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.modifySalary(id,sal);
	}
	@Override
	public boolean deleteById(int eid) {
		 return edao.removeById(eid);
	}
	
	public boolean deleteBySal(double sal) {
		return edao.removeBySalary(sal);
	}
	@Override
	public Set<Employee> searchBySal(double sal) {
		
		return edao.searchSal(sal);
	}
	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortSal();
	}
	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortName();
	}
	@Override
	public Set<Employee> sortById() {
		
		return edao.sortId();
	}
	


}
