package com.multithread;

public class syncronizeThread {

	public static void main(String[] args) throws InterruptedException {
	count c = new count();
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			
		}
	});
Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			
		}
	});

	t1.start();
	t1.join();
	t2.start();
	t2.join();
	System.out.println("count is:" +c.count);
	}

}

class count{
	int count;
	
	public synchronized void increment() {
		count++;
		
	}
}
