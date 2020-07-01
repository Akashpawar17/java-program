package com.demo;



class Emp {
	int id;
	int salary;
	static String ceo;
	

public void show() {
	System.out.println(id +":"+ salary +":" +ceo);
	
}
}

public class StaticDemo {

	public static void main(String[] args) {
		Emp akash = new Emp();
		
		akash.id=1;
		akash.salary=1000;
		Emp.ceo = "akash";
		
		Emp abd = new Emp();
		abd.id= 2;
		abd.salary = 5000;
		abd.ceo = "akash";
		Emp.ceo="akas";
		akash.show();
		abd.show();

	}

}
