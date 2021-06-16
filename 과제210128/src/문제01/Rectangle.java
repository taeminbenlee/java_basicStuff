package 문제01;

public abstract class Rectangle extends Shape {
	double width; //폭
	double height; //높이
	
	 Rectangle(double width, double height){

		 this(new Point(0,0), width, height);

		   }
		   Rectangle(Point p, double width, double height){

		 super(p); //조상의 멤버는 조상의 생성자가 초기화

		 this.width = width;

		 this.height = height;

		   }
		 	@Override

		 	double calcArea() {

		 		return width * height;

		 	}
		 	boolean isSquare(){

		 //width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다.

		 		return width*height!=0 &&(width == height); 

		 	}

		 }