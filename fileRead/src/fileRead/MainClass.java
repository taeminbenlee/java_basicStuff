package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		File file = new File("d:\\tmp\\newfile.txt");
		
		
		try {
			/*
			//한글자씩 읽어오는 방법
			FileReader fr = new FileReader(file);
			
			int ch = fr.read();
			while(ch != -1) { //EOF -> end of file
				System.out.print((char)ch);
				ch = fr.read();
			}
			fr.close();
			*/
			//문장으로 읽어오는 방법 (주로 가장 많이 사용하는 방법)
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str; //초기값
			while ((str = br.readLine()) != null) { //새로 갱신하면서 null이 아닐때까지
				System.out.println(str); //출력	
			}
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
		
		
		
	}

}
