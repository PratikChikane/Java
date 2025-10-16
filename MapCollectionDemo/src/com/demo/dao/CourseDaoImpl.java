package com.demo.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CourseDaoImpl implements CourseDao {
	static Map<String, Integer> hm;
	static {
		hm = new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DBDA", 65);
		hm.put("DITISS", 60);
	}
	@Override
	public boolean save(String cname, int capacity) {
		if(hm.containsKey(cname))
			return false;
		hm.put(cname, capacity);
		return true;
	}

	@Override
	public Map<String, Integer> findAll() {
		return hm;
	}

	@Override
	public int findByName(String cname) {
		if(hm.containsKey(cname))
			return hm.get(cname);
		else
			return -1;
	}

	@Override
	public boolean updateByname(String cname, int newcap) {
		// TODO Auto-generated method stub
		if(hm.containsKey(cname)) {
			hm.put(cname, newcap);
			return true;
		}
		return false;
	}

	@Override
	public Set<String> findByCapacity(int capacity) {
		Set<String> keys=hm.keySet();
		Set<String> cnames = new HashSet();
		for(String s: keys) {
			if(hm.get(s)>capacity) {
				cnames.add(s);
			}
		}
			if(cnames.size()>0) {
				return cnames;
			}
		
		return null;
	}

	@Override
	public boolean updateCourseName(String oname, String nname) {
		// TODO Auto-generated method stub
		if(hm.containsKey(oname)) {
			int c= hm.remove(oname);
			hm.put(nname,c);
			return true;
		}
		return false;
	}

}
