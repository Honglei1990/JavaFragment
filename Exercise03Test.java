package com.hrgj.java_9;

public class Exercise03Test {
	public static void main(String[] args) {
		Exercise03 e = new Exercise03() ;
		Thread t1 = new Thread(e) ;
		Thread t2 = new Thread(e) ;
		Thread t3 = new Thread(e) ;
		Thread t4 = new Thread(e) ;
		
		t1.setName("vip 1");
		t2.setName("vip 2");
		t3.setName("vip 3") ;
		t4.setName("vip 4");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
}
