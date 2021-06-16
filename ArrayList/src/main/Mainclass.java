package main;

import java.util.ArrayList;
import java.util.List;

import dto.MyClass;

public class Mainclass {

	public static void main(String[] args) {
		/*
			Collection : 수집

			List :	목록 
				ArrayList
					배열처럼 사용할 수 있는 리스트
					선형구조 				O-O-O-O-O
					검색속도가 빠르다
					index로 접근한다					
				
				LinkedList
					추가/삭제 속도가 빠르다
				
			Map :
			
				HashMap
				
				TreeMap
				
		//	Set == 집합	
		
		*/
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		// 추가
		arrlist.add(111);
		
		Integer in = new Integer(222);
		arrlist.add(in);
		
		arrlist.add(new Integer(333));
		
		int len = arrlist.size();
		System.out.println("목록의 크기:" + len);
		
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println( arrlist.get(i) );
		}		
		
		// 삭제
		arrlist.remove(1);
		
		len = arrlist.size();
		System.out.println("목록의 크기:" + len);
		
		for (Integer n : arrlist) {
			System.out.println(n);			
		}
				
		// 원하는 위치에 추가
		Integer num = new Integer(200);
		arrlist.add(1, num);
		
		for (Integer n : arrlist) {
			System.out.println(n);			
		}
				
		// 검색
		int index = arrlist.indexOf( 333 );
		System.out.println("index:" + index);
		
		index = -1;
		for (int i = 0; i < arrlist.size(); i++) {
			Integer v = arrlist.get(i);
			if(v == 200) {
				index = i;
				break;
			}
		}
		
		// 수정
		Integer uData = new Integer(555);
		arrlist.set(2, uData);
		
		for (Integer n : arrlist) {
			System.out.println(n);			
		}
		
		
		// ArrayList<String> slist = 
		// 추가(끝에추가, 중간추가)
		// 삭제
		// 검색
		// 수정
		
		
		// MyClass( number, name, height )
		// ArrayList<MyClass>
	//	ArrayList<MyClass> list = new ArrayList<MyClass>();
		List<MyClass> list = new ArrayList<MyClass>();
		
		// 추가(끝에추가, 중간추가)
		MyClass cls = new MyClass(1, "홍길동", 180);
		list.add(cls);
		
		list.add(new MyClass(2, "일지매", 182));
		
		cls = new MyClass(3, "성춘향", 175);
		list.add(cls);
				
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			System.out.println(my.toString());
		}
		
		// 삭제
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			System.out.println(my.toString());
		}
		
		// 검색
		String name = "홍길동";
		index = -1;
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			if(name.equals(my.getName())) {
				index = i;
				break;
			}
		}
		
		System.out.println("검색된 데이터:" + list.get(index).toString());
		
		
		// 수정
		list.set(1, new MyClass(4, "정수동", 178));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}		

	}

}







