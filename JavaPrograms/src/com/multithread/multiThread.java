package com.multithread;

public class multiThread {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj = new a();
		Runnable obj1 = new b();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		
		t1.start();
		
		//obj.start();
	
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
   
		t2.start();
		t1.join();
		t2.join();
	
		//obj1.start();
System.out.println("bye");
	}

}
class a implements Runnable//extends Thread
{
	public void run() {
		
		for(int i=1;i<=5;i++) {
		System.out.println("a show");
		try {Thread.sleep(1000);
		} catch (InterruptedException e) {	e.printStackTrace();
		}
		
	}
}}

class b implements Runnable//extends Thread
{
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("b show");
		try {Thread.sleep(1000);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
}
