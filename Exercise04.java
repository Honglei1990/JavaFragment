package com.hrgj.java_9;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise04 implements Runnable{
	public void run(){
		synchronized(this){
			String color = Thread.currentThread().getName();
			if(color.equals("��ɫ��")){
				System.out.println("��ɫ��"+randomBall(33, 6));
			}
			else if(color.equals("��ɫ��")){
				System.out.println("��ɫ��"+randomBall(16, 1));
			}
		}
	}
	
	
	//�����  number������뷶Χ    sumball ȡ���ٸ���
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
