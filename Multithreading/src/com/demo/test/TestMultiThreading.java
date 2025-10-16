package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.MyFactorialThread;
import com.demo.threads.MyPrimeThread;
import com.demo.threads.MyprintTableThread;

public class TestMultiThreading {

	
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		MyFactorialThread fth = new MyFactorialThread(5,ob);
		fth.start();
		MyprintTableThread th1 = new MyprintTableThread(3,ob);
		th1.start();
		MyprintTableThread th4 = new MyprintTableThread(8,ob);
		th4.start();
		MyPrimeThread th2 = new MyPrimeThread(7,ob);
		th2.start();
		
		
		MyPrimeThread th3 = new MyPrimeThread(9,ob);
		Thread th = new Thread (th3);
		th.start();
		
		
		
		try {
			fth.join();
			th1.join();
			th2.join();
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main function continues....");
		
	}
}
