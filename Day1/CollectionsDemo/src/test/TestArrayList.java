package test;

import java.time.LocalDate;
import java.util.Optional;
import beans.Employee;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee(12,"Rajesh",45687,LocalDate.of(2025,02,10)));
		elist.add(new Employee(13,"Rashmi",55687,LocalDate.of(2025,05,10)));
		elist.add(new Employee(12,"Amit",35687,LocalDate.of(2025,07,10)));
		
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		System.out.println("----------------------");
		for(Employee e:elist) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		Iterator<Employee> it = elist.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
		//it is a bidirectional iterator
		ListIterator<Employee> it1=elist.listIterator();
		
		//1.8
		elist.forEach(System.out::println);
		//search by id
		
		int id =13;
		Optional<Employee> op = elist.stream().filter(emp->emp.getEmpid()==id).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Not Found");
		}

	}

}
