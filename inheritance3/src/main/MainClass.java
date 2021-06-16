package main;

import cls.ChildOne;
import cls.ChildThree;
import cls.ChildTwo;
import cls.SuperClass;

public class MainClass {
	public static void main(String[] args) {
		/*					=========	
							=부모클래스=
							=========

				자식클래스1		자식클래스2		자식클래스3
	
	//부모 클래스를 자식클래스 3개 혹은 그이상이 상속시킬때 
	* 생성되는것을 모두 부모클래스로 먼저 잡아서 
	* 자식클래스들을 관리 하기 편하게 한다.
	* 묶어주는것은 부모클래스로 묶고
	* 자식클래스들을 cast변환을 통하여 관리를 한다.
	*/
		
		SuperClass sc1 = new ChildOne();
		SuperClass sc2 = new ChildTwo();	
		SuperClass sc3 = new ChildThree();	
		
		// 배열로 바꾼다면
		SuperClass scArr[] = new SuperClass[5];
		scArr[0] = new ChildOne();
		scArr[1] = new ChildTwo();
		scArr[2] = new ChildThree();
		scArr[3] = new ChildTwo();
		scArr[4] = new ChildThree();
		// 위에것과 같은 문법 단지 배열로 바꾸어준것
		for (int i = 0; i < scArr.length; i++) {
			scArr[i].method();
		}
		//func(); 를 호출하려면 
		//1. 하나하나 손으로 cast변환
		ChildOne o = (ChildOne)scArr[0];
		o.oneFunc();
		
		// instanceof 부모클래스의 인스턴스로 생성된 자식 클래스의 인스턴스를 찾아주는 예약어
		for (int i = 0; i < scArr.length; i++) {
			if(scArr[i] instanceof ChildOne) {
				System.out.println("scArr[" + i + "]는 ChildOne으로 생성되었습니다."); //참이면 실행됨
		}else if(scArr[i] instanceof ChildTwo) {
			System.out.println("scArr[" + i + "]는 ChildTwo으로 생성되었습니다."); //참이면 실행됨
		
		} else if(scArr[i] instanceof ChildThree) {
			System.out.println("scArr[" + i + "]는 ChildThree으로 생성되었습니다."); //참이면 실행됨
		}
		} // i 번지에 따라 찾아주는것
		
		// 각각 자식클래스123의 메소드가 실행된다.
		//==============================위와같이 해줄수가 없다면===============================================
		ChildOne oneArr[] = new ChildOne[3];
		ChildTwo twoArr[] = new ChildTwo[3];
		ChildThree threeArr[] = new ChildThree[3];
		// 이경우 각각의 배열을 각각 관리해야한다.
	}
}
