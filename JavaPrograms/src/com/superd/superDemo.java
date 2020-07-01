package com.superd;

public class superDemo {

	public static void main(String[] args) {
		b obj = new b(5);// every constructer will call super

	}
}
	//super class
	class a extends Object{
		public  a() {
			//by default it has super
			super();
			System.out.println("in consturuct a");
			
		}
		public a(int a) {
			System.out.println("parameter consturt a");
		}
		
	}
	//sub class
	class b extends a{
		public b() {
			super();
			System.out.println("in contruct b");
		}
		public b(int a) {
			super(a);
			System.out.println("parameter consturt b");
		}
		
	}


