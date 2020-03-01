package chapter3;

import java.util.Scanner;

public class Switch {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		caseExplination();
		caseExample1();
		}
	
	
	//Example of how to use case's instead of If/Else statements
	public static void caseExample1() {
		
		System.out.println("Select an option (1,2,3,4) ");
		
		int choice = in.nextInt();
		
		//If you actually want to use the fallthrough behavior, tag the surrounding method with the annotation @SuppressWarnings("fallthrough"). 
		switch (choice)
		{
		case 1:
			System.out.println("You choose option 1");
			break;
			
		case 2:
			System.out.println("You choose option 2");
			break;
		
		default:
			System.out.println("You didn't enter 1 or 2");
		}
		
	}
	
	public static void caseExplination() {
		
		System.out.println("A case label can be: " + "\n" +  "\n" +
		"* A constant expression of type char, byte, short, or int" + "\n" +
				"* An enumerated constant " + "\n" +
				"* Starting with Java 7, a string literal" + "\n\n");
	}
	
	public static void caseBreakExample() {
		
		int years = 1, balance = 5, goal = 10, payment = 1;
		double interestRate = 1;
		
		while (years <= 100 && balance < goal)
		{
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			if (balance >= goal) break;
			years += 1;
		}
	}
	
}

