package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(11,"Ashutosh","AI",56789));
		lst.add(new Employee(12,"Pratik","IT",98989));
		lst.add(new Employee(23,"ashish","asistant",6544));
		
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata1.txt"));
				){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata1.txt"))){
			while(true) {
				Employee e = (Employee)ois.readObject();
				System.out.println(e);
			}
		}catch(EOFException e){
			System.out.println("Reached at the end of file....");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

}
