package com.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparator {

	public static void main(String[] args) {
		
		List<student> student = new ArrayList<student>();	
		student.add(new student(101," nakash", 100));
		student.add(new student(124," nakash", 1200));
		student.add(new student(113," nakash", 300));
Collections.sort(student,(s1,s2)->{
	return s1.rollno>s2.rollno?1:s1.rollno<s2.rollno?-1:0;
}
		
		
		);
		for (student student2 : student) {
			System.out.println(student2);
			
		}
	}

}
class student{
	int sid;
	String name;
	int rollno;
	public student(int sid, String name, int rollno) {
		super();
		this.sid = sid;
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}
