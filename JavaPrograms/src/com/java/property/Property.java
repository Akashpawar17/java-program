package com.java.property;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException  {
		Properties p= new Properties();
	/*	OutputStream os = new FileOutputStream("akash.properties");
		p.setProperty("url", "localhost:3306/akash");
		p.setProperty("uname", "root");
		p.setProperty("pass", "aA@12345");
		p.store(os, null);*/
			InputStream is = new FileInputStream("akash.properties");
			try {
				p.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("uname"));
			System.out.println(p.getProperty("pass"));
			p.list(System.out);

	}

}
