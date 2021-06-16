package 문제03;
/*
 * 문3) 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
class Parent {
int x=100;
Parent() {
this(200);
}
Parent(int x) {
this.x = x;
}
int getX() {
return x;
}
}
class Child extends Parent {
int x = 3000;
Child() {
this(1000);
}
Child(int x) {
this.x = x;
}
}
class Exercise3 {
public static void main(String[] args) {
Child c = new Child();
System.out.println("x="+c.getX());
}
}
 */
public class 문제03 {

	/*
	 * 	실행순서
	 * 	Child(int x) -> Child() -> Parent(int x) -> Parent() -> int getX()
	 * 
	 * 	실행결과 x=200
	 */
	
	
	
}
