package inheritanceConstructor;

import cls.ChildOneClass;
import cls.ParantClass;

public class MainClass {
	public static void main(String[] args) {
		// 상속 -> 생성자

		ChildOneClass cc = new ChildOneClass('A');
		
		ParantClass pc = new ParantClass("성춘향");
				
		ChildOneClass co = new ChildOneClass("일지매");
		co.namePrint();		
		co.setName("향단이");
		co.namePrint();
	}
}


