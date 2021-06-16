package main;

import my.MyClass;

public class MainClass {
	public static void main(String[] args) {
		
		MyClass cls = new MyClass();
		
	//	cls.number = 1;			private	
		cls.name = "홍길동";		// public
	//	cls.height = 172.1;		protected
	
		cls.setNumber(123);
		int number = cls.getNumber();
	}

}
