package com.sikiedu1;

public class helloworld {
	public static void main(String[] args) {
		System.out.println("helloworld ÄãºÃ");

		String s1 = "hellokarvel1";
		String s2 = new String("hellokarvel1");

	
		System.out.println(s1 == s2);
		System.out.println("address of s1 = " + s1.hashCode());
		System.out.println("address of s2 = " + s2.hashCode());
		System.out.println(s1.equals(s2));
		
		test t1 = new test(1, "hello"); 
		test t2 = new test(1, "hello"); 
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
	}
		
}

class test {
	int i =0;
	String str = null;
	public test(int i, String str) {
		
	}
	public boolean equals(test t) {
		if(this.i == t.i &&this.str == t.str) {
			return true;
		}
		else return false;
	}
	
	
	
}

