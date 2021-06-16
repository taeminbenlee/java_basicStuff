import java.util.Scanner;

public class work0125_10진수2진수 {

	public static void main(String[] args) {
		/*
			입력 
				1. 10진수 -> 2진수 = 함수
				2. 2진수 -> 10진수 = 함수
				
				
		 */

		int number=0;
		
		decToBin(number);
		
		
		
	}

	//1. 10진수를 2진수로 바꾸는 함수
	static void decToBin (int decimal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 입력: ");
		int number=sc.nextInt();
		decimal =number;
		int tag;
		
		String bin="";
		boolean b=true;
		while(b) {
			tag = number%2;
			number=number/2; //
			bin = tag+bin;
			if (number ==0) {
				break;
			}
			//
		}
	System.out.println("2진수: "+bin);
}
	

	
	//2. 2진수를 10진수로
	static void binToDec (String bin) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 입력: ");
		int number=sc.nextInt();
		int dec;
		
		
		System.out.println("10진수: ");
		}
	}
	