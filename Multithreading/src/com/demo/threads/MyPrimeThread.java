package com.demo.threads;

import com.demo.beans.MyClass;

public class MyPrimeThread extends Thread{
	  private MyClass ob;
	    private int n;
	public MyPrimeThread(int n, MyClass ob) {
		// TODO Auto-generated constructor stub
		
		super();
		this.n = n;
		this.ob =ob;
	}
	@Override
	public void run() {
		boolean status = ob.checkPrime(n);
		if(status) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
