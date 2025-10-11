package com.demo.Test;

import com.demo.beans.MyTestClass;
public class TestFunctionOverloading {

	public static void main(String[] args) {
		MyTestClass ob = new MyTestClass();
		System.out.println(ob.max(12,13,45));
		System.out.println(ob.max(33,90));
		System.out.println(ob.max("hello","Pratik"));
		System.out.println(ob.max(12.5f, 13.5f));
		System.out.println(ob.add(12, 34));
		System.out.println(ob.add(12,13,14,5,6,75,5));
	}

}
