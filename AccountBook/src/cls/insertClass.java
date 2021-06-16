package cls;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.AccountDao;
import db.DBConnection;
import dto.accountDto;


public class insertClass {
	/*
	private String dateTime;
	private String title;
	private String classify;
	private int money;
	private String memo;
	*/
	//String dateTime, String title, String classify, int money, String memo
	
		Scanner sc = new Scanner(System.in);
		public void insert() {
		
		System.out.println("제목: ");
		String title = sc.next();
		System.out.println("수입/지출: ");
		String classify = sc.next();
		System.out.println("금액: ");
		int money = sc.nextInt();
		System.out.println("메모: ");
		String memo = sc.next();
		
		
		AccountDao dao;
		dao = AccountDao.getInstance();
		boolean b = dao.insert(new accountDto(null, title, classify, money, memo)); //date는 sysdate로 받으니 그냥 null로
		
		if(b) {
			System.out.println("데이터가  추가되었습니다");
			return;
		} 
			System.out.println("데이터가 추가되지 않았습니다.");
		}	

	
	
}


