package main;

public class MyClass {
	int number;
	public void method() {
		System.out.println("Myclass mehtod()");
	}
	
	public static void staticMethod() {
		System.out.println("Myclass staticMethod()");
	}
	
	public static MyClass getObject() { //클래스가 자료형으로 들어간 static method, 유틸리티에서 많이 사용...?
		MyClass cls = new MyClass();
			// cls 초기화
			// 필요한 처리
			
		// number = 1; 맴버변수 접근불가 
		// method();
		// this. 사용불가
		
		return cls;
	}
}
