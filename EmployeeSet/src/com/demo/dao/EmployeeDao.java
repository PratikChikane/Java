package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String nm);

	boolean modifySalary(int id, double sal);

	boolean removeById(int eid);

	boolean removeBySalary(double sal);

	Set<Employee> searchSal(double sal);

	List<Employee> sortSal();

	List<Employee> sortName();

	Set<Employee> sortId();

}
