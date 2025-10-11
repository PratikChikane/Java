package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
static Set<Employee> eset;
static { eset=new HashSet<>();
eset.add(new Employee(105,"amit",57777,LocalDate.of(2023,11,11)));
eset.add(new Employee(106,"Ajay",56565,LocalDate.of(2023,11,02)));
eset.add(new Employee(100,"Arti",56565,LocalDate.of(2024,02,02)));
eset.add(new Employee(101,"Anita",46565,LocalDate.of(2024,02,02)));
eset.add(new Employee(103,"Ajay",56565,LocalDate.of(2023,11,02)));
eset.add(new Employee(104,"Ajay",56565,LocalDate.of(2023,11,02)));


}
	
	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return eset.add(e);
	}

	@Override
	public Set<Employee> findAll() {
		// TODO Auto-generated method stub
		return eset;
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> ob = eset.stream().filter(e->e.getEmpid()==id).findFirst();
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
	}

	@Override
	public Set<Employee> findByName(String nm) {
		Set<Employee> es = eset.stream().filter(e ->e.getEname().equals(nm)).collect(Collectors.toSet());
		if(es.size()>0) {
			return es;
		}
		return null;
	}

	@Override
	public boolean modifySalary(int id, double sal) {
	
		Employee e = findById(id);
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}

	@Override
    public boolean removeById(int eid) {
        return eset.remove(new Employee(eid));
    }

	@Override
	public boolean removeBySalary(double sal) {
		return eset.removeIf(e->e.getSal()>sal);
	}

	@Override
	public Set<Employee> searchSal(double sal) {
		Set<Employee> e = eset.stream()
				.filter(emp->emp.getSal()==sal)
				.collect(Collectors.toSet());
		if(e.size()>0) {
			return e;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Employee> sortSal() {
		Comparator<Employee> csal = (o1, o2)->{
			System.out.println("In salary comparator"+o1.getSal()+"---"+o2.getSal());
			return (int)(o1.getSal()-o2.getSal());
		};
		List<Employee> es = new ArrayList<>();
		for(Employee e: eset) {
			es.add(e);
		}
		es.sort(csal);
		return es;
	}

	@Override
	public List<Employee> sortName() {
		Comparator<Employee> cname =(o1,o2)->{
			System.out.println("In salary comparator"+o1.getEname()+"----"+o2.getEname());
			return (o1.getEname().compareTo(o2.getEname()));
		};
		
		List<Employee> elist = new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(cname);
		return elist;
	}

	@Override
	public Set<Employee> sortId() {
		// TODO Auto-generated method stub
		Set<Employee> tset = new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
	}
	
	

}
