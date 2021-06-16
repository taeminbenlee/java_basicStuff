package main;

import java.util.Calendar;

public class MainClass {
	public static void main(String[] args) {
		
		//MyClass cls = new MyClass();
		
		//cls.method(); // member method 혹은 instance method 라고 한다. 
		
		//cls.staticMethod(); // 객체를 통하여 호출이 가능하지만 정상적인 경로의 호출은 아니다
		
		MyClass.staticMethod(); // 이렇게 호출하여야 정상. static method의 경우 클래스명으로 호출해야한다. 
								// static변수의 경우에도 클래스명으로 호출 하였다. 
		MyClass cls = MyClass.getObject(); //객체 생성하는 코드 자체가 메소드 안에 존재 하기에 바로 호출가능..
											// MyClass cls = new MyClass(); 이것이 메소드안에 있음
		Calendar cal = Calendar.getInstance(); // getInstance또한 static method다. 
	}
}
