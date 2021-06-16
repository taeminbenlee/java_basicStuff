
public class MainClass {

	public static void main(String[] args) {
		/*
			Exception (예외) : 형식이 다른 다른값이 들어오는것 (에러는 아님)
			
			baseball -> 1~10 (숫자기입) -> 'A' == 65 (범위를 벗어났다는 것일뿐 에러(틀린건) 아님) 
			
			예)
			number -> format A B C 
			
			array -> index 범위초과 [5] -> [0]~[4] -> [5] 범위 벗어남
			class -> 없음
			file -> 없음
			exception 종류 검색하면 많이 나옴 
			설명 보면 무엇때문인지 나오기 때문에 수정하기에 편함.
			
			형식: try{ }catch( ){ } catch( ){ }catch( ){ }
				
				try{
				// 예외가 발생될 가능성이 있는 코드
				 * 
				} catch (예외클래스명1 e(변수)){
					예외클래스1 메시지를 출력
				} catch(예외클래스2 e){ 
					예외클래스2 메시지를 출력
				} //catch 부분은 (예외클래스는) 계속 추가 가능
				catch(예외클래스3 e){
					예외클래스3 메시지를 출력
				 } finally{ //뒤처리용 코드 무조건 실행됨
				 	무조건 실행!
				 	undo/rollback(복구) //되돌림
				 }
			
			
				//메소드에 추가하는 형태
				static void method() throws 예외클래스{
					
				}
		 */
		//익셉션 발생시키기
		int array [] = {4,8,6};
		
		System.out.println("start");
		
		try {
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
		System.out.println("proc"); // 이건 처리가 안됨 왜냐하면 예외가 나면 그다음 처리를 못하기 때문
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("배열범위초과"); (알아볼수있는 호출)
			//e.printStackTrace(); // 예외 설명
			System.out.println(e.getMessage()); //(어디에서 예외가 나왔는지 출력해줌)
			
			//return; 
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally { //finally는 무조건 실행 (앞에서 return으로 나가도 무조건 실행)
			
			System.out.println("finally 부분");
		}
		
		
		System.out.println("end");
		
		
		
	//	method(); IndexOutOfBoundsException 에러가 안나옴
		try { //ClassNotFoundException = 함수밖에다가 try catch 를 붙여야함
		callClass(); // 에러가 나온다
	}catch(ClassNotFoundException e) {
		System.out.println("클래스를 찾을수 없다");
	}
		// 하지만 try
		
		
	}
	static void method() throws IndexOutOfBoundsException{
		int num[] = {11,22,33};
		//try {
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
		//}catch(IndexOutOfBoundsException e) {
		//	e.printStackTrace();
		//}
	}
	
	static void callClass() throws ClassNotFoundException{ //본인이 사용자 클래스를 잡았는데 보이지 않는경우??
		Class.forName("myclass");
		System.out.println("callClass end");
	}
	
	/*static void callClass() { //본인이 사용자 클래스를 잡았는데 보이지 않는경우??
		try {
				Class.forName("myclass");
		}catch(ClassNotFoundException e) {
		System.out.println("클래스를 찾을수 없음");
		}
		System.out.println("callClass end");
	}*/ //이렇게 하면 위에랑 똑같은데 외부에다가 try catch 를 안쓰기 때문에 함수 출력시 안써도 되지만 개발자 입장에서 알아보기 힘들다?
	
	
}
