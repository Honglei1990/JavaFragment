package com.hrgj.java_9;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise04 implements Runnable{
	public void run(){
		synchronized(this){
			String color = Thread.currentThread().getName();
			if(color.equals("红色区")){
				System.out.println("红色球："+randomBall(33, 6));
			}
			else if(color.equals("蓝色区")){
				System.out.println("蓝色球："+randomBall(16, 1));
			}
		}
	}
	
	
	//随机球  number定义号码范围    sumball 取多少个球
	public static String randomBall(int number, int sumball){
		String result = "" ;
		int num = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>() ;
		int count = 0;
		while(true){
			num = (int)((Math.random()*100)+1)%(number+1) ;
			if(num!=0){
				int temp = 0;
				Iterator<Integer> it = arr.listIterator() ;
				while(it.hasNext()){
					if(it.next()==num){
						temp++;
					}
				}
				if(temp == 0){
					arr.add(num) ;
					
					count ++;
				}
			}
			if(count==sumball){
				break;
			}
		}
		for(Integer ii:arr){
//			System.out.println(ii);
			result = result + "  " + ii;
		}
		return result ;
	}
}
