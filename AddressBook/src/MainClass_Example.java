import java.util.Arrays;
import java.util.Scanner;

public class MainClass_Example {

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
		boolean out = false;
		while(true) {
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
					select(Member);
					
					break;
				case 4:
					update(Member);
					break;
				case 5:
					allprint( Member );
					break;
				case 6:
					out = true;
					break;
			}	
			if (out) {
				System.out.println("프로그램 종료");
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
		String name;
		
		System.out.println("삭제할 친구: ");
		name = sc.next();
	
		int index = search(mem, name);
		if (index == -1) {
			System.out.println("학생명단에 없습니다.");
			return;
		}
	//	else { //if index == -1 에서 리턴으로 빠져나오면 else쓰지않아도 바로 된다. 없는경우 빠져나오는 거라서.
			mem[index][0] = "";
			mem[index][1] = "";
			mem[index][2] = "";
			mem[index][3] = "";
			mem[index][4] = "";
			
			System.out.println("삭제하였습니다");
	//	}	
	} 
	
	
	static void select(String mem[][]) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 친구: ");
		name = sc.next();
		int index = search(mem, name);
		if (index == -1) {
			System.out.println("데이터를 찾을수 없습니다.");
			return;
		}
		System.out.println("데이터를 찾았습니다.");
				System.out.println("이름: " + mem[index][0]);
				System.out.println("나이: " + mem[index][1]);
				System.out.println("전화번호: " + mem[index][2]);
				System.out.println("주소: " + mem[index][3]);
				System.out.println("메모: " + mem[index][4]);
		}
	
	static void update(String mem[][]) {
		Scanner sc = new Scanner(System.in);
		String name;
		String newName, newAge, newPhone, newAddress, newMemo;
		
		System.out.println("수정할 친구: ");
		name = sc.next();
		int index = search(mem, name);
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
			if (name.equals(mem[index][0])) {
				
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
				mem[index][0] = newName;
				mem[index][1] = newAge;
				mem[index][2] = newPhone;
				mem[index][3] = newAddress;
				mem[index][4] = newMemo;
				System.out.println("수정 하였습니다.");
				
			} 
			
	}
	static int search(String mem[][], String name) { //메소드 안에서 검색하기 위한 메소드
		int index= -1; //=1은 못찾았다 라는 뜻;
		for (int i = 0; i < mem.length; i++) {
			if (name.equals(mem[i][0])) { //찾았다
				index = i;
				break;
			}
		}
		return index;
	}
	static void allprint( String mem[][] ) {		
		for (int i = 0; i < mem.length; i++) {
			for (int j = 0; j < mem[i].length; j++) {
				if(mem[i][j] != null && mem[i][0].equals("")) { //빈칸없애기
					System.out.print(mem[i][j] + " ");	
					if(j == 4) {
						System.out.println();
					}
				}
			}
		}
	}

}



