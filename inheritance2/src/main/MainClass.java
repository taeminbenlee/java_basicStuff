package main;

import cls.childClass;
import cls.parentClass;

public class MainClass {

	public static void main(String[] args) {
		
		childClass cc = new childClass();
		
		//자식클래스가 부모클래스를 상속받기대문에
		//부모클래스 상속자 호출뒤에 자식클래스 상속자가 호출된다
		cc.method();
		//메소드 호출
		parentClass pc = new childClass(); // 인스턴스(객체)는 부모클래스로 잡고 자식클래스를 생성하는것 가능하다.
		pc.method(); //이경우 메소드 호출시 생성된 클래스의 오버라이드된 메소드가 호출된다 
		// pc.func(); func()는 자식클래스에 생성된 자식클래스만의 메소드이다. 
		//			그렇기에 부모클래스로 생성된 객체에서는 자식클래스의 메소드를 호출할수가없다.
		/*		클래스 상속 그림
		 * 
				==================childClass======================
				=												=
				=	func()		=========parentClass=====		=		
				=				=						=		=
				=	method	<-	=	method()			=		=	
				=				=						=		=
				=				=						=		=
				=				=========================		=
				=												=
				=================================================
				부모클래스의 메소드만 자식클래스의 메소드로 상속시켰다.
		 */
		// cast 변환 
		childClass c = (childClass)pc; //부모클래스의 인스턴스(객체)를 자식클래스의 인스턴스로 바꿔준다. 이경우 
		c.func(); 
		
		
		
	}
}
