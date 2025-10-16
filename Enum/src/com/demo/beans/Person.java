package com.demo.beans;

import com.demo.enums.Gender;

public class Person {
	private int pid;
	private String name;
	private Gender gender;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int pid,String name, Gender gender) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "TestPerson [pid=" + pid + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
