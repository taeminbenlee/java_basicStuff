package cls;




import dao.AccountDao;


public class BalanceClass {
	public void balance() {
		AccountDao dao;
		dao = AccountDao.getInstance();
	dao.accountBalance();
		
	}
	
	
}
