package main;

public class MainClass {

	public static void main(String[] args) {
		/*
				static == 정적 <==> dynamic 동적
				어느 영역이든지 접근 가능.
				
				
		 */
		// 맴버변수의 접근, 접근할때 객체생성 해야함 instance를 통하여 접근.
		//MyClass cls = new MyClass();
		//cls.number = 1;
		
		//static으로 된 변수는 객체 생성x
		//MyClass.staticVar = 12;
		
		MyClass cls = new MyClass();
		cls.function();
		cls.function();
		cls.function();
		//local변수의 경우 메소드가 실행될때 초기화 되었다가 다시 실행되기 때문에 값이 1로써 메소드가 반복되더라도 그대로이다.
		MyClass cls1 = new MyClass();
		cls1.function();
		cls1.function();
		//맴버변수의 경우 다른 객체가 메소드를 실행했기 때문에 다시 1부터 시작
		//static은 전에 메소드의 최종 값에 이어서 시작, 4부터 시작 초기화가 안됨
		
	}
}
