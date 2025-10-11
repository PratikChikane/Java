package com.demo.Test;

public class TestStringData {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3=s2;
		String s4 = new String("Hello");
		System.out.println("s2==s3"+(s2==s3));
		System.out.println("s2 == s4" +(s2==s4));
		System.out.println(" s2.equlas(s4) "+(s2.equals(s4)));
		s1= "Welcome";
		
		System.out.println(" s2==s1 "+(s2==s1));
		
		StringBuffer sbf = new StringBuffer("Hello");
		System.out.println(sbf.append(" Everyone"));
		
		StringBuilder sdb = new StringBuilder("Hello ");
		System.out.println(sdb.append("World"));
		
		String s6= "xxx,yyy,zzz-rrrr";
		String[] arr = s6.split(",");
		String str = String.join(":", arr);
		System.out.println(str);

	}

}
