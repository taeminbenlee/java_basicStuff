package cls;


import java.util.ArrayList;
import java.util.Scanner;

import dao.AccountDao;
import dto.accountDto;

public class selectUseClass {
	Scanner sc = new Scanner(System.in); 
	public void select() {
		AccountDao dao;
		dao = AccountDao.getInstance();
		System.out.println("찾을 데이터의 제목: ");
		String title = sc.next();
		
		ArrayList<accountDto> list = dao.getTitle(title);
		for (int i = 0; i < list.size(); i++) {
			if(list != null) {
			accountDto d = list.get(i);
			
			System.out.println(d.toString());
			}
			
	}
	}
}
	
		
	
	
