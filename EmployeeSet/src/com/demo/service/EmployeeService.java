package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewemployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	boolean updateSalary(int id, double sal);

	boolean deleteById(int eid);

	boolean deleteBySal(double sal);

	Set<Employee> searchBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortById();

}
