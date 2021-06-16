package MainClass;

public class MainClass01 {
	public static void main(String[]args) {
		
		/*
			function 함수, 독립적
			method 	함수, class에 속해있는 함수
				(자바의 경우 class에 속해있기때문에 메소드라고 한다)
				
				
			parameter(매개변수) (인수,인자)(여러개가 될수있다)
			return(돌아오는 값)
				
				함수의 종류
				1. 파라미터0 리턴0 들어오는것x 돌아오는값x
				2. 파라미터0 리턴1 들어오는것x 돌아오는값o
				3. 파라미터n 리턴0 들어오는것o 돌아오는값x
				4. 파라미터n 리턴1	들어노는것o 돌아오는값o
				
				형식: (기본형태)
				
				return값의 자료형 함수명(파라미터){
					
					처리코드
					
					return 값; //앞에의 자료형과 같은 자료형이여야 한다.
				}
			
				void: 자료형이 없는 것
				
				구성요소
				parameter(매개변수)
				return 값
		 */
		
	//method구현	
		
		methodName();
		int r = method1(7); // 7은 argument 실인수
		System.out.println("r= "+r);
		
		method2("a g ain");
		
		
		int r1 = method3();
				System.out.println(r1);
		//int array[] = new int[5];
		int array[] = method4();
		
		int r2 = method5('Z', "hello world");
		System.out.println(r2);
		
	}
	//들어오는것 돌아오는것 둘다 없는 메소드
	static void methodName() {
		System.out.println("void methodName() 호출");
	}
	// 들어가는 값, 돌아오는값 둘다 있는
	static int method1(int p) { //int는 리턴값의 자료형, p(파라미터)는 가인수
		System.out.println("int method1(int p) 호출");
		
		p = p*2;
		return p;
	}
	// 들어가는 값만 있는 메소드 돌아오는 값이 없음
	static void method2(String s) {
		System.out.println("int method2(String s) 호출");
		
		String str=s.replace(" ", "");
		str = str.toUpperCase();
		
		System.out.println("str= "+str);
	}
	// 돌아오는값만 있는 메소드 (랜덤값받는것도 돌아오는값만있음)
	static int method3() {
		int r = 123;
		return r;
	}
	// 돌아오는 값만 있는 배열
	static int[] method4() {
		int num[] = new int[10];
		return num;
	}
	// 들어오는 값이 여러개이고 돌아오는값은 하나
	static int method5(char c, String str) { //들어가는 값 2개
		System.out.println("c =" + (int)c);
		int len = str.length();
		return len;
		
	}
}
