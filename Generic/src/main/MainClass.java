package main;

public class MainClass {
	public static void main(String[] args) {
		/*
			Generic == template(형태)
				: 자료형의 변수
				: 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우사용하는 요소		
		*/
		
		Box<Integer> box = new Box<Integer>(123);
		System.out.println(box.getTemp() + 23);
		
		Box<String> sbox = new Box<String>("Hello");
		System.out.println(sbox.getTemp() + 23);
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "홍길동");
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());

	}
}

class Box<T> {
	
	T temp;

	public Box(T temp) {		
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap<KEY, VALUE>{
	KEY key;
	VALUE value;
	
	public BoxMap(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}

	public KEY getKey() {
		return key;
	}

	public void setKey(KEY key) {
		this.key = key;
	}

	public VALUE getValue() {
		return value;
	}

	public void setValue(VALUE value) {
		this.value = value;
	}
}











