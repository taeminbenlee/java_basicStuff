package main;

import cls.Child;
import cls.Parant;

public class MainClass {
	public static void main(String[] args) {
		/*
			Over Ride : 부모클래스로부터 상속받은 메소드를 자식 클래스에 고쳐 기입			
		*/
		
	//	Child c = new Child();
	//	c.method();
		
		Parant pc = new Child();
		pc.method();
	}
}





