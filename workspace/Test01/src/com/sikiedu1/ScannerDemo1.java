package com.sikiedu1;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class ScannerDemo1 {
	public static void main(String[] args) {

			
		BigDecimal m1 = new BigDecimal("155.51515");
		BigDecimal m2 = BigDecimal.valueOf(155.51515);
		BigDecimal m3 = new BigDecimal(155.51515);//��������
		System.out.println(m1.add(m2));
		System.out.println(m1);
		System.out.println(m2);	
		System.out.println(m3);
		Date data1 = new Date();
		System.out.println(data1);
		Calendar cal1  =  Calendar.getInstance();
		System.out.println(cal1.YEAR);
		
	}
}
