package cls;


import java.util.ArrayList;

import dao.AccountDao;
import dto.accountDto;

public class printAllClass {
	public void printAll() {
		
		AccountDao dao;
		dao = AccountDao.getInstance();
		
		ArrayList<accountDto> list = dao.print();
		for (int i = 0; i < list.size(); i++) {
			if(list != null) {
			accountDto d = list.get(i);
			
			System.out.println(d.toString());
			}
		}
		
		
	}

}
