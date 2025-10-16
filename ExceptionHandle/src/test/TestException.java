package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	
	private static int divide(int x,int y) {
		return x/y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Number:");
			int num = sc.nextInt();
			System.out.println("Enter a second Number:");
			int num1 = sc.nextInt();
			
			int ans= divide(num,num1);
			System.out.println("Division:"+ans);
			
			System.out.println("At the end of outer try block");
			
			
		}
		catch(InputMismatchException e){
			System.out.println("please enter a number ..");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
