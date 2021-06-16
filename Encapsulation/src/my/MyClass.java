package my;

public class MyClass {
	/*
		Encapsulation == 은닉성, 캡슐화
		외부접근 제어(차단, 읽기전용, 허용여부)	
		
		접근지정자
		private : 개인적인
		public : 대중적인
		protected : 상속에 관련 보호
	*/
	
	// 멤버 변수는 90% private
	private int number;
	public String name;
	protected double height;
	
	// method 통해서 접근여부 결정
	public void setNumber(int number) {	// setter
		this.number = number;
	}
	public int getNumber() {			// getter
		return number;
	}
	
	
	
}


