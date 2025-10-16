package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readData(String fname);

	boolean save(Employee e);

	boolean removeById(int id);

	boolean updateById(int id, double sal);

	List<Employee> findAll();

	Employee findById();

	Employee findById(int empid);

	void writeData(String fname);

}
