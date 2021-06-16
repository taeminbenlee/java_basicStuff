package myStudy;

public class 상급구구단 {

	public static void main(String[] args) {
		/*
		2x1 = 2
		2x2x2 = 4
		2x2^2 = 8
		2x2^3 = 16
		2x2x2x2x2=32
		:
		:
		:
		2x2x2x2x2x2x2x2x2=512
		
		같이 구단까지 출력하시오~
		
		 */
		//이것이 기본 구구단
		//for (int i = 2; i <= 9; i++) {
		//	for (int j = 1; j <= 9; j++) {
		//		System.out.println(i + "*" + j + "=" + i*j);
		//	}
		//}
		
		//제곱근 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				print(i,j);
			}
		}	
	}
	public static void print(int x, int y) {
		//2, 1  -> 2 x 1 =2
		// 2,2 -> 2x2 =4
		//2,3 -> 2x2x2 =8
		//이렇게 나오게 처리
		String stringVal = "";
		int sum = x; //초기값은 어차피 2*1=2 니깐 x로 초기화
		int val = 1;
		for (int z = 1; z <= y; z++) {
			if( y == 1) {
				val =1;
				//만약 y가 1이면
				stringVal += x + " * " + val;
				sum = x;
			}
			else {
				if (z == 2) {
					val =x;
					stringVal = x + " * "+ val;
					sum = x;
				}
				val = x;
				sum *= val;
				stringVal += " * "+ val;
			}
		}
		System.out.println(stringVal + " = " + sum);	
	}
}
