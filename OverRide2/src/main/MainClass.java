package main;

import cls.ChildOne;
import cls.ChildTwo;
import cls.SuperClass;

public class MainClass {
	public static void main(String[] args) {
		
		// ChildOne + ChildTwo = 5  객체생성이 아님 그냥 
		ChildOne one[] = new ChildOne[5];
		ChildTwo two[] = new ChildTwo[5];		
		one[0] = new ChildOne();
		two[0] = new ChildTwo();
		two[1] = new ChildTwo();
		one[1] = new ChildOne();
		one[2] = new ChildOne();
		
		SuperClass sc[] = new SuperClass[5];		
		sc[0] = new ChildOne();
		sc[1] = new ChildTwo();
		sc[2] = new ChildTwo();
		sc[3] = new ChildOne();
		sc[4] = new ChildOne();
		
		for (int i = 0; i < sc.length; i++) {
			sc[i].method();
		}
	}
}



