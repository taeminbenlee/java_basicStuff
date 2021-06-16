package 과제;

//	class Exercise1 {
// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.

public class 과제_함수01 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(Math.abs(x1-x),2)+
				Math.pow(Math.abs(y1-y),2));
		}
		public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}

// Math.sqrt(x) : x(숫자)의 제곱근값 반환 = 루트
// Math.sqrt(64) = return 8
// Math.pow(x.y) : x의 값을 y의 횟수만큽 제곱한 값을 반환합니다.
// Math.pow(8.2) = return 64
// Math.abs(x) : x의 양수값을 반환합니다.
// Math.abs(-4.7) = return 4.7
