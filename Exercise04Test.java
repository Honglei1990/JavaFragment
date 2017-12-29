package com.hrgj.java_9;
/*
 * xxxx双色球玩法
 * 
 * 红色球 1-33号 开奖出6个球
 * 蓝色球1-16号 开出一个球
 * 
 * 这种双色球6+1玩法 简称：  xxxx双色
 * 
 * */
public class Exercise04Test {
	public static void main(String[] args) {
		System.out.println("Honglei福利彩票双色球.");
		Exercise04 e = new Exercise04() ;
		Thread t1 = new Thread(e) ;
		Thread t2 = new Thread(e) ;
		
		t1.setName("红色区") ;
		t2.setName("蓝色区") ;
		
		t1.start() ;
		t2.start();
		
	}
}
