package com.demo.enums;

public enum Coffee {

	
	small(150,150.00),medium(200,250.00),large(300,350.00);
	private int size;
	private double price;
	private Coffee(int size,double price) {
		System.out.println("in Coffee Constructor"+size+"----"+price);
		this.size = size;
		this.price = price;
		
	}



	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}



	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	}
