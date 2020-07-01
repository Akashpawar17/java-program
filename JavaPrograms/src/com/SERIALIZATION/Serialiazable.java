package com.SERIALIZATION;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialiazable {
	public static void main(String[] args) {
		Student s = new Student();

		s.setRollno(101);
		s.setSname("akash");
		Student s1 = new Student();

		s1.setRollno(101);
		s1.setSname("akash");
		List<Student> student = new ArrayList<>();
		student.add(s);
		student.add(s1);
		College c = new College();
		c.setStudent(student);
		// TO STORE VALUE WE HAVE TO USE XMLENCODER IN WHICH WE HAVE TO PASS BOS AND FOS
		try {
			XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myfile.xml")));
			xml.writeObject(c);
			xml.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
