//package ���
// javac -d . com.sikiedu.person  ��ǰĿ¼�´�����
// java com.sikiedu.person.FinalDemo1 ��������
package com.sikiedu.person;
public class FinalDemo1{
	public static void main(String[] args){
			
		Son s1 = new Son(5);
		
	
		s1.q1();
		
			
	}
}
class Father{
	int number1  = 0;
	public Father(int number1){
		
		int num1  = number1+1;
		System.out.println(num1+"���๹�췽��");
	}
	
	private void q1(int number1){
		
		
		System.out.println(number1+"���Ǹ���");
	}
	
	
	
}
class Son extends Father{

	public Son(int num){
		super(num);//��������super �Ը����Ƚ��й��죬super �� this ���ڸ����뵱ǰ��
		//q1(num);
		System.out.println(num+"���๹�췽��");
		
		
	}
	public void q1(){
		System.out.println("��������");
	}
	
}
