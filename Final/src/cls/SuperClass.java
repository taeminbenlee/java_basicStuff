package cls;

//final을  class앞에 붙이면 상속을 막아준다. 상속금지!
public /*final*/ class SuperClass {

	public /*final*/void method() {
		//final = 메도드에서도 붙여주면 over ride금지!
	}
	
}
//한 클래스에 또다른 클래스를 생성할수도 있다~ 다만 앞에 public은 생략하고 기입해야한다.
class ChildClass extends SuperClass{
	
	public void method() { //over ride
		
	}
}