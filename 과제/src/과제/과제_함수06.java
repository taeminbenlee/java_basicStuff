package 과제;
/*
(1) 두 수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성하시오.
*/ 
import java.util.Scanner;
public class 과제_함수06 {
	static void myMethod(int num1, int num2, int result, double tag) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		num2 = sc.nextInt();
		  result = num1 / num2;
		  tag = num1%num2;
		  System.out.println("몫: "+result+"나머지: "+tag);
		}

		public static void main(String[] args) {
			myMethod(0, 0, 0, 0);
		 
	
	

}
}