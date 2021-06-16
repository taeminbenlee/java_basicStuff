import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		// NullPointerException
		String str = null; //값 없는것 통 자체가 없음//String str1 = ""; // 값은 있는것 빈통
		
		try {
		System.out.println(str.length());
		} catch(NullPointerException e) {
			System.out.println("str이 null입니다");
		}
		
		// ArrayIndexOutOfBoundsException
		int arr[] = {1,2,3};;
		try {
			arr[3]=4;
		}catch(ArrayIndexOutOfBoundsException e) {
		//	System.out.println("배열범위초과");
			e.printStackTrace();
		}
		
		//FileNotFoundException
		//저장매개체인 파일에 경로설정이 잘못된경우
		File file = new File("d:\\xxx");
		FileInputStream is;
		
		try {
		is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//StringIndexOutOfBoundsException
		//한글자씩 꺼낼때 charAt 범위 초과
		String str1 = "java";
		try {
		str1.charAt(4);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//NumberFormatException //형식에 맞지 않는것 65 -> 'A'
		
		try {
		int i = Integer.parseInt("12a3");
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		//Exception을 파악하는 이름을 모르겠을땐 catch에 그냥 exception e 로만 해도 다 각각에 해당하는 exception으로 결과를 보여준다.
		//Exception만 써도 된다.
		
	}

}
