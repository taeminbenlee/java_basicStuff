package cls;

public class parentClass {
	//변수설정
		private String name; //접근불가
		protected int number; //접근가능 외부에서는 불가 하지만 자식은 가능
		//기본생성자
		public parentClass() {
			System.out.println("parentClass parentClass()");
		}
		//부모클래스 메소드
		public void method() {
			System.out.println("parentClass method()");
		}
}
