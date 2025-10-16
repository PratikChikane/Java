package com.demo.threads;

import com.demo.beans.MyClass;

public class MyprintTableThread extends Thread{
	 private int n;
	   private MyClass ob;
	public MyprintTableThread(int n, MyClass ob) {
		// TODO Auto-generated constructor stub
		super();
		this.n= n;
		this.ob = ob;
	}
	
	public void run() {
		ob.printTable(n);
	}

}
