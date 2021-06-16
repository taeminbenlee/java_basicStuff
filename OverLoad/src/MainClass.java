
public class MainClass {

	public static void main(String[] args) {
		/*
			Over Load : 함수(메소드) 명은 같고 
						매개변수(parameter)의 자료형이나 갯수가 다른것을 의미.
						
				예: 메소드 명은 같으나 매개변수가 다르다 (목적에 따라서) 결국 다 다른 함수임
					print() 			: 이미지를 drawing해주는 함수
					print(int x, int y) : 이미지 위에 이미지를 drawing(위치정보를 가지고 있다)
					print(char c)		
					print(int i)
					print(char c, int y) 
					print(int y, char c)
					
					print(int y, int x) : 이것은 가인수만 다르지 위에 함수와 같은 자료형 형태이기 때문에 오버로드가 안됨
		 */
		method(); //매개변수 없으면 없는것
		
		method('a'); //매개변수 있으면 그 매개변수에 따라 실행
		
		method(3);
		
		method('f', 123.4567);
		
		method(123.4567, 'f');
		
		int sum = sumProc(1, 4, 6, 2, 3, 56, 78, 23);
		System.out.println("sum: "+sum);
		
		double avg = avg("hello", 1, 2, 3, 4, 5);
		System.out.println("avg: "+avg);
		
		int array[] = {11,22,33};
		avg("hello", array); //배열값을 넣어 주는것도 가능
		System.out.println("avg: "+avg);
		// int...num으로 써도 되고 배열로 써도됨 int array[]
	}

	static void method() {
		System.out.println("method() 호출");
	}
	
	static void method(char c) {
		System.out.println("method(char c) 호출");
	}
	static void method(int i) {
		System.out.println("method(int i) 호출");
	}
	static void method(char c, double d) {
		System.out.println("method(char c, double d) 호출");
	}
	static void method(double d, char c) { //다른 자료형의 매개변수 위치가 다르면 어쨋든 된다// 컴파일러는 앞에서 부터 순차적으로 
		System.out.println("method(double d. char c) 호출");
	}
	//static void method(double a, char e) { //가인수만 달라진것은 오버로드로 성립 안됨
		
	//}
	
	//static int method() { //리턴값만 다른경우 사용불가
		
	//}
	
	// 가변인수 : 인수값을 갯수상관없이 설정할수 있는것/ 활용될때의 예: printf
	static int sumProc(int...num) { //int...num : 배열, 숫자 여러개
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
	// 일반인수와 가변인수를 같이 사용 하지만 가변인수(int...num)은 마지막에 와야한다. 결국 가변인수는 하나 밖에 못쓴다.
	static double avg(String str, int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		return  sum / num.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
