package cls;


import java.util.Scanner;

import dao.AccountDao;

public class deleteClass {
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 데이터의 제목: ");
		String title = sc.next();
		AccountDao dao;
		dao = AccountDao.getInstance();
		boolean b = dao.delete(title);
		
		if(b == true) {
			System.out.println("데이터 삭제");
		}

	}
	
}

