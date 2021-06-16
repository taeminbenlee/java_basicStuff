package 문제01;

public abstract class Circle extends Shape {
	double r; //반지름
	
	Circle(double r){
		this(new Point(0,0), r); //Circle(Point p, double r)를 호출

		  }

		  Circle(Point p, double r){
		super(p);

		this.r = r;

		  }

			@Override

			double calcArea() {

				return r * r * Math.PI;

			}

		}
	

