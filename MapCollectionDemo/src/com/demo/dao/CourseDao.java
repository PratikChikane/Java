package com.demo.dao;

import java.util.Map;
import java.util.Set;

public interface CourseDao {

	boolean save(String cname, int capacity);

	Map<String, Integer> findAll();

	int findByName(String cname);

	boolean updateByname(String cname, int newcap);

	Set<String> findByCapacity(int capacity);

	boolean updateCourseName(String oname, String nname);

}
