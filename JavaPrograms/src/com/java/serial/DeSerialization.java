package com.java.serial;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.SERIALIZATION.College;
import com.SERIALIZATION.Student;

public class DeSerialization {
	public static void main(String[] args) {
		try {
			XMLDecoder xml = new XMLDecoder(new BufferedInputStream(new FileInputStream("myfile.xml")));
	College c=	(College) xml.readObject();
	List<Student> student = c.getStudent();
	for (Student student2 : student) {
		System.out.println(student2);
		
	}
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	}


