package cls;

public class ParantClass {
	
	private String name;

	public ParantClass(char c) {
		System.out.println("ParantClass ParantClass(char c)");
	}
	
	public ParantClass(String name) {
		this.name = name;
		System.out.println("ParantClass ParantClass(String name)");
	}
	
	public void namePrint() {
		System.out.println("ParantClass name = " + name);		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
