package com.pkr.jlc;

public class addfromchild {
	public static void main(String []args) {
add1 h=new add2();
h.add();
}
}
class add1{
	int a=10;
	int b=20;
	//int c;
	void add() {
	System.out.println("me pkr");	
	}
}
	class add2 extends add1{
		void add() {
			int c=a+b;
			System.out.println("sum of a and b:"+"\t"+c);
		}
	}
