package com.clone;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		abc obj  = new abc();
		obj.i=5;
		obj.j=6;
		System.out.println(obj);
		
		//shallow copy
		//abc obj1 = obj;
		
		
		//deep copy
		/*abc obj1 = new abc();
		obj1.i=obj.i;
		obj1.j = obj.j;
		obj1.j=8;*/
		
		abc obj1 =(abc) obj.clone();
		
		
		System.out.println(obj1);

	}
	
	
}
	
	class abc implements Cloneable {
		int i;
		int j;
		@Override
		public String toString() {
			return "abc [i=" + i + ", j=" + j + "]";
		}
		
	
	
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	}

