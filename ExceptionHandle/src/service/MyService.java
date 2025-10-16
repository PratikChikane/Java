package service;

import java.util.Scanner;

import beans.Employee;
import exception.NegativeSalaryException;

public class MyService {

	 public void acceptData() throws NegativeSalaryException{
		 Scanner sc = new Scanner(System.in);
		 Employee emp = new Employee(12,"xyz",454545);
		 emp.setSal(-2000);
	 }
}
