package 문제05;

import cls.ChildOne;
import cls.ChildThree;
import cls.ChildTwo;

/*
 * 문5) 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
[Hint] instanceof연산자를 사용해서 형변환 한다.
[실행결과]
춤을 춥니다.
노래를 합니다.
그림을 그립니다.
메서드명 : action
기 능 : 주어진 객체의 메서드를 호출한다.
DanceRobot인 경우, dance()를 호출하고,
SingRobot인 경우, sing()을 호출하고,
DrawRobot인 경우, draw()를 호출한다.
반환타입 : 없음
매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
 */
public class 문제05 {
	
	public static void main(String[] args) {
	Robot[] arr = { new DanceRobot(), new SingRobot(),
	new DrawRobot()};
	for(int i=0; i< arr.length;i++)
	action(arr[i]);
	} // main
	public void action(Robot r) {
		
			if(r instanceof DanceRobot) {
				Dance();
		}else if(r instanceof SingRobot) {
			sing();
		
		} else if(r instanceof DrawRobot) {
			draw();
		}
	}
}
