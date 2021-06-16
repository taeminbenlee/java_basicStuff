package main;

import dto.MemberDto;

public class MainClass {
	public static void main(String[] args) {
		
		String Member[][] = {
				{ "홍길동", "24", "123-4567", "서울시", "동창" },
				{ "성춘향", "18", "234-5678", "남원시", "여사친" },
				{ "정수동", "26", "345-5678", "평창시", "선배" },				
		};	
		
		// 배열
		MemberDto memArr[] = new MemberDto[100];		
		// 객체
		memArr[0] = new MemberDto(); 
		
		// 추가
		memArr[0].setName("홍길동");
		memArr[0].setAge(24);
		memArr[0].setPhone("123-4567");
		memArr[0].setAddress("서울시");
		memArr[0].setContent("친구");
		
		System.out.println(memArr[0].getName());
		
		System.out.println(memArr[0].toString());

		
	}
}






