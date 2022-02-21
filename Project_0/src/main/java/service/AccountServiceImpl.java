package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import pojo.AccountPojo;

public class AccountServiceImpl implements AccountService {
		AccountDao accountDao;
	public AccountServiceImpl() {
		 accountDao = new AccountDaoImpl();
	}
	
	
	@Override
	public AccountPojo accountCreate(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		
		return accountDao.accountCreate(accountPojo);
	}


	@Override
	public AccountPojo accountInfo(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		return accountDao.accountInfo(accountPojo);
	}


	@Override
	public AccountPojo accountLogin(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		return accountDao.accountLogin(accountPojo);
	}


}
