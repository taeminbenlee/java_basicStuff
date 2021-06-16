package myStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 정수정렬 {

	public static void main(String[] args) {
		/*
		 * 						정수 내림차순으로 배치하기
			==========================================================
			문제 설명

			함수 solution은 정수 n을 매개변수로 입력받습니다. 
			n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
			예를들어 n이 118372면 873211을 리턴하면 됩니다.
			==========================================================
			제한 조건

			n은 1이상 8000000000 이하인 자연수입니다.
			==========================================================
			입출력 예

			n	        return

			118372	873211
			==========================================================

		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 정수를 입력하시오");
		long n = sc.nextLong();
		System.out.println("입력한 정수의 값: "+n);
		boolean range;
		if ((n<800000000) && (n>1)) {
			range = true;
		} else { range = false;}
		
		if (range=true) {
		
		String str = String.valueOf(n);
		String num[] = str.split("");
		
		Arrays.sort(num,Collections.reverseOrder());
		
		System.out.println(Arrays.deepToString(num));
		
		
		}
	}

}
