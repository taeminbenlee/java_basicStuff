import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
			주소록
			
			column : 이름, 나이, 전화번호, 주소, 내용
					홍길동   24   123-4567 서울시 고교동창	""
					
			배열 : row = 100	
			
			Menu
			1. 친구추가
			2. 친구삭제
			3. 친구검색
			4. 친구수정
			5. 모든 데이터 출력
			6. 종료	
		*/
		
		String Member[][] = new String[100][5];
		int mCount = 0;
		boolean run = true;
		while(run) {
			// 메뉴
			System.out.println("menu----------------");
			System.out.println("1.친구추가");
			System.out.println("2.친구삭제");
			System.out.println("3.친구검색");
			System.out.println("4.친구수정");
			System.out.println("5.모든 데이터 출력");
			System.out.println("6.종료");
			
			// 입력 1 ~ 6
			System.out.print(">>");
			int worknum = sc.nextInt();
			
			switch( worknum ) {
				case 1:
					insert( Member, mCount);
					mCount++;
					break;	
				case 2:
					delete(Member);
					break;
				case 3:
					findFriend(Member);
					
					break;
				case 4:
					edit(Member);
					break;
				case 5:
					allprint( Member );
					break;
				case 6:
					System.out.println("프로그램 종료");
					run = false;
					sc.close();
					break;
			}			
		}
	}
	
	static void insert(String mem[][], int mCnt) {
		Scanner sc = new Scanner(System.in);
		// 이름, 나이, 전화번호, 주소, 내용
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		String age = sc.next();
		
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		System.out.print("주소 = ");
		String address = sc.next();
		
		System.out.print("내용 = ");
		String content = sc.next();
		
		mem[mCnt][0] = name;
		mem[mCnt][1] = age;
		mem[mCnt][2] = phone;
		mem[mCnt][3] = address;
		mem[mCnt][4] = content;
	}
	static void delete(String mem[][]) {
		Scanner sc = new Scanner(System.in);
		String tempDelete;
		boolean delete = false;
		System.out.println("삭제할 친구: ");
		tempDelete = sc.next();
	
			for (int i = 0; i < mem.length; i++) {
			
				if (tempDelete.equals(mem[i][0])) {
					delete=true;
				
						mem[i][0] = null;
						mem[i][1] = null;
						mem[i][2] = null;
						mem[i][3] = null;
						mem[i][4] = null;
							
				}
				
		} if(delete==true) { 
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("일치하는 데이터가 없습니다.");
			
		}
		
		} 
		
	
	
	static void findFriend(String mem[][]) {
		String tempFindFriend;
		boolean find = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 친구: ");
		tempFindFriend = sc.next();
		
		for (int i = 0; i < mem.length; i++) {
			
			
			if (tempFindFriend.equals(mem[i][0])) {
				find = true;
				System.out.println("이름: " + mem[i][0]);
				System.out.println("나이: " + mem[i][1]);
				System.out.println("전화번호: " + mem[i][2]);
				System.out.println("주소: " + mem[i][3]);
				System.out.println("메모: " + mem[i][4]);
				
			}
			
		}if(find==false) {
			System.out.println("일치하는 데이터가 없습니다.");
		} 
		
	}
	static void edit(String mem[][]) {
		Scanner sc = new Scanner(System.in);
		String tempEdit;
		String newName, newAge, newPhone, newAddress, newMemo;
		
		boolean edit = false;
		System.out.println("수정할 친구: ");
		tempEdit = sc.next();
		
		for (int i = 0; i < mem.length; i++) {
			if (tempEdit.equals(mem[i][0])) {
				edit = true;
				System.out.println("새로운 정보를 입력하세요");
				System.out.println("이름: ");
				newName = sc.next();
				System.out.println("나이: ");
				newAge = sc.next();
				System.out.println("번호: ");
				newPhone = sc.next();
				System.out.println("주소: ");
				newAddress = sc.next();
				System.out.println("메모: ");
				newMemo = sc.next();
				mem[i][0] = newName;
				mem[i][1] = newAge;
				mem[i][2] = newPhone;
				mem[i][3] = newAddress;
				mem[i][4] = newMemo;
				System.out.println("수정 하였습니다.");
				
			} 
			} if (edit==false) {
				System.out.println("일치하는 데이터가 없습니다.");
		}	
	}
	static void allprint( String mem[][] ) {		
		for (int i = 0; i < mem.length; i++) {
			for (int j = 0; j < mem[i].length; j++) {
				if(mem[i][j] != null) {
					System.out.print(mem[i][j] + " ");	
					if(j == 4) {
						System.out.println();
					}
				}
			}
		}
	}

}



