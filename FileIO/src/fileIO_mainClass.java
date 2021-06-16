

import java.io.File;
import java.io.IOException;

public class fileIO_mainClass {
	public static void main(String[] args) {
		/*
			file : 	저장 매체 == 기능
					Database(file)
		  
		  	*.txt -> 2진수	dll, lib
		  	 				Dynamic Link Library -> DLL(동적)
		  	 				Library 			 -> LIB(정적)
		*/
		
		File file = new File("c:\\");
		
		// 파일(+폴더) 조사
		/*
		String filelist[] = file.list();		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		// 파일명과 폴더명을 조사
		/*
		File filelist[] = file.listFiles();		
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());
			}
			else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
		*/
		
		// 파일 포인터 생성
		File newFile = new File("d:\\tmp\\newfile.txt");		
		try {
			if(newFile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 폴더 생성
		File newDir = new File("d:\\tmp1\\sub");		
		if(newDir.mkdirs()) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		// file 존재 여부
		if(newFile.exists()) {
			System.out.println("newFile.txt가 존재합니다");
		}else {
			System.out.println("newFile.txt가 존재하지 않습니다");
		}
			
		// 읽기전용
		//newFile.setReadOnly();
		
		// 쓰기가능 여부
		if(newFile.canWrite()) {
			System.out.println("이 파일은 쓰기가 가능합니다");
		}//else {
		//	System.out.println("이 파일은 쓰기를 할 수 없습니다");
		//}
		
		// 삭제
		//newFile.delete();
		
	}
}









