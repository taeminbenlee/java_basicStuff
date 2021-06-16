package main;

public class MainClass {
	public static void main(String[] args) {
		/*
			final : constant 상수/ const(C++) define
			변수, 메소드, 클래스 적용가능
			
			
			
		 */
			
		final int NUMBER = 1;
		//int number는 값을 계속 변화시켜서 변수이다
		//앞에 final이 붙으면 변수->상수 가 되어 변할수없는 수가 된다.
		// number = 2; 이것은 오류가 난다 왜냐하면 앞서서 final로 상수화 되었기 때문
		// final 은 대입용으로 사용한다 , 대문자 사용(가독성이 더 좋다. 대문자면 변할수없다 라는 표시)
		// 또한 변수에 대한 값을 미리 위에 처럼 지정하고 사용한다. 지정안하면 에러.
		//예)
		int num;
		num = NUMBER;
		
		//회원가입 만들때
		final int MEMBERCOUNT = 20; //이런식으로 변하지 않는 최대값을 지정해줄때 쓴다. 자주쓰이진 않는다.
	}
}
