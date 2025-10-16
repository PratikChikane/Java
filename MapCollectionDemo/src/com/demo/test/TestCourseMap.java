package com.demo.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestCourseMap {
	public static void main(String[] args) {
		Map<String, Integer>  hm = new Hashtable<>();
		hm.put("DAC", 240);
		hm.put("DBDA", 65);
		hm.put("DITISS", 60);
		hm.put("DBDA", 70);
		Set<String> kset  = hm.keySet();
		kset.forEach(k->System.out.println(k+"---->"+hm.get(k)));
		Set<Map.Entry<String, Integer>> ms=hm.entrySet();
		ms.forEach(e->System.out.println(e.getKey()+"--->"+e.getValue()));
		
	}
}
