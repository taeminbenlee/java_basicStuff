package myStudy;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("제품의 가격을 입력하세요");
		int product = sc.nextInt();
		System.out.println("제품가격: "+product);
		System.out.println("받은금액을 입력하세요");
		int money = sc.nextInt();
		System.out.println("받은금액: "+money);
		if (product>money) {
			System.out.println("받은금액이 부족합니다.");
			return;
		} else {
			int change = money-product;
			int [] changeUnit = {50000,10000,5000,1000,500,100,50,10,1};
			for (int i = 0; i < changeUnit.length; i++) {
				System.out.println(changeUnit[i]+"원"+change/changeUnit[i]);
				change = change%changeUnit[i];
			}
		}
		}
		
	}
}
