package test;

import java.util.Scanner;

import exception.NegativeSalaryException;

public class TestException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			try {
			System.out.println("Enter Salary: ");
			double sal =sc.nextDouble();
			if(sal<0) {
				throw new NegativeSalaryException("Salary cannot be -ve");
			}
			System.out.println("Salary: "+sal);
			break;	
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			catch(NegativeSalaryException e) {
				e.printStackTrace();
			}
		}
	}
}
