package com.SERIALIZATION;

import java.util.List;

public class College {
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [student=" + student + "]";
	}
	

}
