import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		File file = new File("d:\\tmp\\newfile.txt");
		//writer는 자동생성됨
		
		try {
			//쓰기방법 1.
		/*	FileWriter fwriter = new FileWriter(file);
			fwriter.write("안녕하세요"+"\n");
			fwriter.write("hello");
			fwriter.close();
			*/
			//쓰기방법 2.
			/*
			FileWriter fwriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fwriter); //저장공간
			PrintWriter pw = new PrintWriter(bw); //저장공간에 추가
			*/
			// 쓰기방법 2를 간략화
			/*
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file))); //여기서도 뒤에 true붙이면 추가됨
			pw.println("안녕하세요"); //println 개행
			pw.print("hello");//개행안함
			pw.println("world");
			pw.close();
			*/
			//추가쓰기
			FileWriter fwriter = new FileWriter(file, true); //true만 붙이면 추가쓰기
			fwriter.write("반갑습니다");
			fwriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
