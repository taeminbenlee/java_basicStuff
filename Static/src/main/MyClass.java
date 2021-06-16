package main;

public class MyClass {
	//					//	변수종류	->	메모리 영역
	public int number; //맴버 변수 member variable -> Heap
	//맴버변수는 접근을 외부와 내부 다 할수있다
	
	static int staticVar; //static변수  global variable 같은 클래스 밑에 있지만 독자적이다. 소속을 알려줘야 하기때문에 
							// 클래스명.staticVar 와 같은 형식으로 사용할수있다. 많이 생성하면 안된다. 
						// 어디든 접근이 가능하다. 다만 남발하면 안된다
						// 무조건 하나. MyClass를 10개를 생성해도 하나.?
	
	
	public void method(int n) { // -> 매개변수 parameter variable -> Stack
		
		int num; // 지역변수 local variable -> Stack
		number=1; //맴버변수는 어느 영역이던 갈수있다.
		
	}
	public void func() {
		number =2;
		MyClass.staticVar = 12;
	}
	public void function() {
		int _num=0; //local
		_num++;
		number++;	//member
		MyClass.staticVar++;	//static
		System.out.println("local variable _num= " +_num + 
				"\nmember variable number = "+ number + "\nstatic variable staticVar= "+MyClass.staticVar);
	}
}
