package cls;


import java.util.Scanner;

import dao.AccountDao;

public class updateClass {
	public void update() {
		Scanner sc =new Scanner (System.in);
		System.out.println("수정할 용도:");
		String title = sc.next();
		System.out.println("금액: ");
		int money = sc.nextInt();
		
		AccountDao dao;
		dao = AccountDao.getInstance();
		int count = dao.Update(title, money);
		if(count == 1) {
			System.out.println("정상적으로 수정됨");
		} 
	}

	
}
