package com.hrgj.java_9;
/*
 * xxxx˫ɫ���淨
 * 
 * ��ɫ�� 1-33�� ������6����
 * ��ɫ��1-16�� ����һ����
 * 
 * ����˫ɫ��6+1�淨 ��ƣ�  xxxx˫ɫ
 * 
 * */
public class Exercise04Test {
	public static void main(String[] args) {
		System.out.println("Honglei������Ʊ˫ɫ��.");
		Exercise04 e = new Exercise04() ;
		Thread t1 = new Thread(e) ;
		Thread t2 = new Thread(e) ;
		
		t1.setName("��ɫ��") ;
		t2.setName("��ɫ��") ;
		
		t1.start() ;
		t2.start();
		
	}
}
