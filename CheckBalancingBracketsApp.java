package com.lab_3.graded_project;

import java.util.Scanner;

public class CheckBalancingBracketsApp {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		CheckBalancingBrackets bb = new CheckBalancingBrackets();
		
		System.out.println("Enter the Expression");
		String input=sc.next();
		
		if(bb.checkExpression(input)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
		sc.close();		
		
	}
}
