package main;

import java.util.Scanner;

import cls.AllprintClass;
import cls.BaseballDao;
import cls.DataLoad;
import cls.DataSave;
import cls.DeleteClass;
import cls.InsertClass;
import cls.SelectClass;
import cls.UpDateClass;
import file.FileProc;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileProc dp = new FileProc("lions");
			
		// Data load
		(new DataLoad(dp)).process();
						
	//	InsertClass ic = new InsertClass();
		
		while(true) {
			BaseballDao dao = null;
			
			System.out.println("menu ---------------------------");
			System.out.println("1.선수추가");
			System.out.println("2.선수삭제");
			System.out.println("3.선수검색");
			System.out.println("4.선수수정");
			System.out.println("5.선수출력");
			System.out.println("6.선수저장");
			System.out.println("7.종료");
			System.out.print(">>>>> ");
			int work = sc.nextInt();
			
			switch(work) {
				case 1:
					dao = new InsertClass();					
					break;
				case 2:
					dao = new DeleteClass();
					break;
				case 3:
					dao = new SelectClass();
					break;
				case 4:
					dao = new UpDateClass();
					break;
				case 5:
					dao = new AllprintClass();
					break;
				case 6:
					dao = new DataSave(dp);
					break;
				case 7:
					System.exit(0);					
					break;			
			}		
			
			dao.process();			
		}	
	}
}
