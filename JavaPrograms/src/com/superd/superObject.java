package com.superd;

public class superObject {

	public static void main(String[] args) {

d obj = new d();
obj.show();

	}

}
class c{ //super class
	int i=5;
	
	
	
}
class d extends c{ //sub class
	
	
	public void show() {
		int i=4;
		System.out.println(super.i);
	}
	
}