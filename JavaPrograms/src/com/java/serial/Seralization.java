package com.java.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seralization {

	public static void main(String[] args)  throws Exception{
		
		Save s = new Save();
			s.i=4;
			File f = new File("akash.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			//System.out.println(oos.toString());
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj=	(Save) ois.readObject();
		System.out.println("value of obj is"+obj.toString());
			
		}
			
}

	class Save implements Serializable{
		int i;

		@Override
		public String toString() {
			return " [i=" + i + "]";
		}
		
		
	}

	


