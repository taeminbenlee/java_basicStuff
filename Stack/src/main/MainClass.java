package main;

import stack.ArrayStack;

public class MainClass {

	public static void main(String[] args) {
		/*
			Stack : First In Last Out
					실린더
					in = push, out = pop
					
			
		 */
		ArrayStack stack = new ArrayStack(5);
		
		String str = "AAA";
		stack.push(str);
		
		String peekStr = (String)stack.peek(); //캐스팅변환 해야함 object를 명시해주는것..
		System.out.println("top: "+peekStr);
		
		str="BBB";
		stack.push(str);
		peekStr = (String)stack.peek(); 
		System.out.println("top: "+peekStr);
		
		str="CCC";
		stack.push(str);
		peekStr = (String)stack.peek(); 
		System.out.println("top: "+peekStr);

		//////////////////////top꺼내기 = pop
		String popStr = (String)stack.pop();
		System.out.println("pop str: "+popStr);
		peekStr = (String)stack.peek(); 
		System.out.println("top: "+peekStr);
	}

}
