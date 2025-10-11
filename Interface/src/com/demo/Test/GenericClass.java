package com.demo.Test;

class Test<T,P>{
	T obj;
	P obj2;
	
	Test(T obj,P obj2){
		this.obj = obj;
		this.obj2 = obj2;
	}
//	public  getObject() {
//		return this.obj;
//		return this.obj2;
//	}
	public void print() {
		System.out.println(obj);
		System.out.println(obj2);
	}
//	
}

public class GenericClass {

	public static void main(String[] args) {
		//instance of inetger type
		
		Test<Integer,String> iObj =new Test<Integer,String>(15,"Pratik");
		iObj.print();
		
		//instance of String type
		
//		Test<String> sObj=new Test<String>("hello there!...");
//		System.out.println(sObj.getObject());
		
		

	}

}
