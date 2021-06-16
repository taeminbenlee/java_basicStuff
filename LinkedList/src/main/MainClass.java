package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class MainClass {
	public static void main (String[]args) {
		/*
				ArrayList : 배열목록
			
			
				LinkedList : (연결한 리스트) 실시간 추가, 삭제의 처리가 빠르다. 속도를 요하는 시스템에서 많이 쓴다.
			 
			
			
		 */
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("tigers"); //wrapper class의 추가법
		
		String str = new String("lions");	//원래의 추가법
		alist.add(str);
		
		alist.add("twins"); 
		
		LinkedList<String> list = new LinkedList<String>(alist); //어레이리스트인 alist를 링크드리스트에 넣어준다
		
		for (String s : list) {
			System.out.println(s);
		} 
		
		if(alist.isEmpty()) {
			System.out.println("array list가 비었습니다.");
		} 
		
		// 맨앞의 요소(element)를 추가 링크드리스트에만 있다.
		list.addFirst("bears");
		alist.add(0, "world"); //arraylist의 젤 처음 추가하는법..
		for (String s : list) {
			System.out.println(s);
		} 
		// 맨뒤의 요소 추가 ....그냥 add하는거,,
		list.addLast("eagles");
		for (String s : list) {
			System.out.println(s);
		} 
		
		
		// iterator : 반복자 == pointer (주소) 0x4 -> 0x8 바이트단위로 늘어난다.  <중요한개념> 
		
		Iterator<String> it;
		it = list.iterator(); //링크드리스트인 list를 이터레이터에 넣어줬다..
		
		while(it.hasNext()) {	// hasNext()로 꺼낼려면 next()로 꺼낸다
			String value = it.next();
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
