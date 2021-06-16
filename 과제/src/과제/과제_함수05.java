package 과제;

import java.util.Arrays;

/*
(1) 배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오. 
*/
public class 과제_함수05 {
	public static void main(String[] args)
	{
	int num1[] = {1, 2, 3, 4, 5};
	// 결과 출력
	System.out.println(Arrays.toString(getDouble(num1)));
	}
	static int[] getDouble (int []arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}
}
