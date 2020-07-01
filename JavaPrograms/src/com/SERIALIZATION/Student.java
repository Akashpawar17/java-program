package com.SERIALIZATION;

public class Student {
	private String sname;
	private int rollno;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + "]";
	}
	
	

}
