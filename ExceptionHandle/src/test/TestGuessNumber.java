package test;

import java.util.Scanner;

import exception.WrongNumberException;

public class TestGuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter Number");
				int num1 = sc.nextInt();
				if(num==num1) {
					System.out.println("Yepeeee, you guess right");
					break;
					
				}else {
					throw new WrongNumberException("oops, you miss it..");
				}
			}catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
