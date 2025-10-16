package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	
	static List<Employee> lst;
	static {
		lst = new ArrayList<>();
	}
	@Override
	public void readData(String fname) {
	File f = new File(fname);
	if(f.exists()) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));){
			while(true) {
				Employee e = (Employee)ois.readObject();
				lst.add(e);
			}
		} 
		catch(EOFException e){
			System.out.println("Reached to end of file");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	System.out.println("size:"+lst.size());
		
	}
	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return lst.add(e);
	}
	@Override
	public boolean removeById(int id) {
		
		return lst.remove(new Employee(id));
	}
	@Override
	public boolean updateById(int id, double sal) {
		
		int pos=lst.indexOf(new Employee(id));
		if(pos!=-1) {
			lst.get(pos).setSal(sal);
			return true;
		}
		return false;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return lst;
	}
//	@Override
//	public Employee findById(empid) {
//		// TODO Auto-generated method stub
//		int pos=lst.indexOf(new Employee(empid));
//		if(pos!=-1) {
//	         return lst.get(pos);
//		}
//		return null;
//	}


	@Override
	public Employee findById(int empid) {
		// TODO Auto-generated method stub
		int pos=lst.indexOf(new Employee(empid));
		if(pos!=-1) {
	         return lst.get(pos);
		}
		return null;
	}
	@Override
	public Employee findById() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void writeData(String fname) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
