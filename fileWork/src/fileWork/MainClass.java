package fileWork;

import java.io.File;  
import java.io.FileNotFoundException;
import java.io.IOException;  
import java.util.Scanner;
import java.io.FileWriter;

class MainClass {
	
	public static void main(String[] args) {
		/*
				함수생성할것
				1. 파일생성 
					이름 나이 주소 (한명분의 데이터)
				2. 데이터 저장 
				3. 데이터 읽기
				
		 */
		
		File myObj = new File("D:\\tmp\\fileO.txt");
		createFile(myObj);
		writeFile(myObj);
		readFile(myObj);
	}
	static void createFile(File myObj) {
	 try {
	      if (myObj.createNewFile()) {
	        System.out.println("생성된 파일: " + myObj.getName());
	      } else {
	        System.out.println("파일이 이미 존재합니다.");
	      }
	    } catch (IOException e) {
	      System.out.println("에러입니다.");
	      e.printStackTrace();
	    }
}
	static void writeFile(File myObj) {
		try {
		      FileWriter myWriter = new FileWriter("D:\\tmp\\fileO.txt");
		      myWriter.write("홍길동"+"\n");
		      myWriter.write("20세"+"\n");
		      myWriter.write("서울시");
		      myWriter.close();
		      System.out.println("성공적으로 파일이 저장되었습니다.");
		    } catch (IOException e) {
		      System.out.println("에러입니다.");
		      e.printStackTrace();
		    }
		  }
	static void readFile(File myObj) {
	    try {
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("에러입니다.");
	        e.printStackTrace();
	      }
	}
}