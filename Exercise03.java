package com.hrgj.java_9;

public class Exercise03 implements Runnable{
	int ticket = 100 ;
	public void run(){
		while(true){
			synchronized(this){
				if(ticket>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"买到了:第"+ticket+"张票.");
					ticket--;
					Thread.yield();
				}
			}
		}
	}
}
