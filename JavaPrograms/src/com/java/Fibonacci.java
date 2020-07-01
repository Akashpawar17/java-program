package com.java;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		
		
		int a,b=1,c=1;
		
		
	Scanner sc = new Scanner(System.in);
	a=0;
	System.out.println("enter any number");
	int x =sc.nextInt();
	
	while(a<=x) {
		
		a=b+c;
		System.out.print(a+"");
		a=b;
		b=c;
		
		
	}
	}
	
	
	
	
	

}
