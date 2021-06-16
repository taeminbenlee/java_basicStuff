package 문제02;

public class MainClass {
/*
문2) 다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 멤버변수인 x, y, z
의 값을 비교하도록 오버라이딩하고, toString()은 실행결과를 참고해서 적절히
오버라이딩하시오.

[실행결과]
[1,2,3]
[1,2,3]
p1==p2?false
p1.equals(p2)?true
 */
	public static void main(String[] args) {
		
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
		}
		}
		class Point3D {
		int x,y,z;
		Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		}
		Point3D() {
		this(0,0,0);
		}
		
		public boolean equals(Object obj) {
			
		 Point3D point = (Point3D)obj;
		 if( this.x==point.x && this.y==point.y && this.z==point.z)
			 return true;
		 else 
			 return false;
		}
		@Override
		public String toString() {
			return "[" + x + "," + y + "," + z + "]";
		}

}
