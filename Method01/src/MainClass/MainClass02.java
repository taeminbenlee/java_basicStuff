package MainClass;
//1. 
//아스키코드값을 넣으면 그것에 맞는 알파벳 출력
//ascci code -> djfkd
//반대로
//2.
//알파벳을 넣으면 아스키 코드값이 나오는 함수
//3.
//숫자를 넣었을때 소수인지 정수인지 판정하는 함수
//소수면 true
//정수면 false
import java.util.Scanner;
public class MainClass02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
	//1번 숫자를 문자로
		System.out.println("아스키코드값을 넣어주세요");
		int num;
		num = sc.nextInt();
		System.out.println("입력하신 아스키코드: "+num);
		
		char r = (char) method1(num); 
		System.out.println(r);	
	//2번 문자를 숫자로	
		int a = charToAsc('a');
		System.out.println("a= "+a);
	//3번 소수 정수 true false
		double d = 1234.567; 
		boolean b = isDouble(d+"");
		if(b) {
			System.out.println("소수입니다");
		} else {
			System.out.println("정수입니다");
		}
	}
	//1번 함수
	static int method1(int num) { 
		System.out.println("num= "+num);
		num=(char)num;
		return num;
}
	//2번 함수
	static int charToAsc(char c) {
		
		int asc = (int)c;
		return asc;
	}
	//3번 함수
	static boolean isDouble(String snum) {
		boolean b = false;
		for (int i = 0; i < snum.length(); i++) {
			char c = snum.charAt(i);
			if(c=='.') {
				b = true;
				break;
			}
		}
		return b;
	}
	
}