package cls;

public class ChildOneClass extends ParantClass {

	/*
	  	this : 자기 참조(주소)
		super : 부모 참조(주소)
	*/
	
	public ChildOneClass() {	
		super('A');
		System.out.println("ChildOneClass ChildOneClass()");
	}
	
	public ChildOneClass(char c) {	
		super('A');
		System.out.println("ChildOneClass ChildOneClass(char c)");
	}
	
	public ChildOneClass(String name) {
		super(name);
	}
	
}




