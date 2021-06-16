package main;

/*
해시 테이블에 유지하려는 데이터의 예
인스턴스 고유의 hashCode ()를 돌려주는 것으로,
equals () 메소드를 구현하고있는 것.
이들은 Object 클래스에 구현이 있지만,
무시하고 구현한다.
그렇게함으로써 설계자가 의도 한대로
동작을 바꿀 수있다. 
 */
public class MyData {
	
	private final String name;
	
	public MyData(String x) {
		name = x;
	}
	 
	public String getName() {
		return name;
	}
	public boolean equals(Object x) {
		MyData y;
		try {
			y = (MyData) x;
		} catch (ClassCastException e) {
			return false;
		}
		return this.name.equals(y.getName());
	}
 
	public int hashCode() {
		int intkey = 0;
		for (byte e : name.getBytes()) {
			intkey += e;
		}
		return intkey;
	}
	public String toString() {
		return name;
	} 
}
