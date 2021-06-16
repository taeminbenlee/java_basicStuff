package myStudy;

import java.util.Scanner;

public class 정수와실수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요(정수 또는 실수)");
		String str = sc.next();
		System.out.println("입력한 값: "+str);
		System.out.println("================================");
		System.out.println("입력값이 숫자인지 판별중... ");
		if (isNumber(str)==true) {
			System.out.println("정수/실수 판별중... ");
			System.out.println("....결과: "+isInt(str));
		}
		sc.close();
	}
	
		private static String isInt(String str) {
			double d = Double.parseDouble(str);
			String result = "";
			int i = (int) Math.floor(d);
			if (d-i == 0) {
				result = "입력한 수 "+str+"은 정수 입니다.";
			} 
			if (d-i > 0) {
				result = "입력한 수 "+str+"은 실수 입니다.";
			}
		return result;
	}

		static boolean isNumber(String str) {
			boolean result = true;
			if (str == null || str.length()==0) {
				result = false;
			}
			else {
				for (int i = 0; i < str.length(); i++) {
					int c = (int) str.charAt(i);
					if (c < 46 || c> 57 || c==47) {
						result = false;
						System.out.println("Math Error");
					}
				}
			}
			return result;
		}
}
