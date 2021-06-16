package myStudy;

import java.util.Scanner;

public class 카카오문제다트게임2018 {
/*
다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수^1 , 점수^2 , 점수^3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

입력 형식
“점수|보너스|[옵션]”으로 이루어진 문자열 3세트.
예) 1S2D*3T

점수는 0에서 10 사이의 정수이다.
보너스는 S, D, T 중 하나이다.
옵선은 *이나 # 중 하나이며, 없을 수도 있다.

출력 형식
3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
예) 37

입출력 예제
예제	dartResult	answer	설명
1	1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
2	1D2S#10S	9		1^2 + 2^1 * (-1) + 10^1
3	1D2S0T		3		1^2 + 2^1 + 0^3
4	1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
5	1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
6	1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
7	1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2
 */
	public static void main(String[] args) {
		//if else 와 while문 활용함.
		//세분화?기법활용. //주석으로 세분화적인 설계를 한다. 구조부터 잡는다. 처리 함수는 나중에 하고
		
		//변수의 선언부터
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dart Score : ");
		String inputVal = scanner.nextLine(); //입력받은 값(점수)의 길이를 체크하자
		
		int len 	= inputVal.length(); //입력받은 값의 길이 //와일문을 돌리기 위한 길이
		int step 	= 1; 				//1:점수|2:보너스|[3:옵션] 이런식으로 값이 들어오고 체크를 하기위한 단계를 위한 step이다.
		int lenPos 	= 0; 				//입력된 값의 위치를 따져볼 변수 (길이좌표)
										//점수는 3개가 들어온다. 배열을 만들어주자
		int [] score = new int[3]; 		//점수
		int scorePos = 0; 				//점수의 좌표값, 배열은 0부터 시작이기 때문에 0으로
		
		//1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
		//1. 입력된 길이의 반복 분석
		while(lenPos < len) {
			String target = inputVal.substring(lenPos, lenPos + 1);
			if(step ==1) {
				
				try {
					// 1.1 1단계 점수 처리 (숫자만 올수있다.) (0~10)
					//	1S2D*3T	=37 이값이 나오게 만들어 보자
					score[scorePos] = Integer.parseInt(target);
					step++;
				}
				catch (Exception e) {
					//1.3 3단계 옵션처리 (*, #)
					if("*".equals(target)) {
						// 1.3.1 스타상 처리
						score[scorePos - 1] = score[scorePos - 1] * 2;
						if(scorePos > 1) {
							score[scorePos - 2] = score[scorePos - 2] * 2;
						}
					}
					else if("#".equals(target)) {
						// 1.3.2 아차상 처리
						score[scorePos - 1] = score[scorePos - 1] * (-1);
					}
					else {
						System.out.println("유효한 다트 점수가 아닙니다.");
						return;
					}
				}
			}
			else if(step==2) {
				// 1.2 2단계 영역처리 (S,D,T)
				if("S".equals(target)) {
					//1.2.1 Single처리
					score[scorePos] = (int)Math.pow(score[scorePos], 1); //s는 제곱
				}
				else if("D".equals(target)) {
					//1.2.2 Double 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 2); //d는 2제곱 
				}
				else if("T".equals(target)) {
					//1.2.3 Triple 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 3); //t는 3제곱
				}
				else if("0".equals(target)) {
					//1.1.1 10점 처리
					//점수가 0에서 10사이기 때문에 0이 나올수 있다 
					if(score[scorePos] == 1) { 
						score[scorePos] = 10;
						//2단계 처리를 다시 하기 위해서 값을 조절
						scorePos--;
						step++;
					}
				}
				else {
					System.out.println("유효한 다트 점수가 아닙니다.");
					return;
				}
				scorePos++; //2단계가 스코어 점수가 두번째 점수를 처리하도록 증가시켜준다.
				step--; // 스텝은 1단계로 가게 빼준다.
			}
			//다음문자 처리
			lenPos++;
		}
		System.out.println(score[0] + score[1] + score[2]);
		
		

	}

}
