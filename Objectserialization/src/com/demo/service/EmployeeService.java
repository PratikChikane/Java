package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String string);

	boolean addNewEmployee();

	boolean deleteById(int id);

	boolean modifyById(int id, double sal);

	List<Employee> getAll();

	Employee getById(int empid);

	void writeToFile(String string);

}
