package com.demo.service;

import java.util.Map;
import java.util.Set;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();

	int searchByName(String cname);

	boolean modifyByName(String cname, int newcap);

	Set<String> displayByCapacity(int capacity);

	boolean modifyCourseName(String oname, String nname);



}
