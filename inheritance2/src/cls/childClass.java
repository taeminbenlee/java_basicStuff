package cls;

public class childClass extends parentClass {
	//자식클래스 생성자
	public childClass() {
		System.out.println("childClass childClass()");
	}
	//부모클래스에서는 접근할수가 없는 자식클래스의 메소드
	public void func() {
		number = 12; //부모클래스에 접근지정자 protected로 변수 설정이 되어있어서 접근가능 (상속받음)
		
		//super.method(); //부모클래스의 원래 메소드
		//this.method(); //현재 자식클래스의 메소드
		System.out.println("childClass func()");
	}
	
	//Over Ride -> 상속받은 클래스에서 메소드를 고쳐 기입하는것. 
	public void method() { //r상속받으면 공통함수라고 생각하자. 
		//super.method(); // super를 통하여 원래의 부모클래스의 메소드가 호출된다. 
		//System.out.println("childClass method()");
	}
	
}
