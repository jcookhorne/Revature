package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import exceptions.SystemException;
import pojo.AccountPojo;

public class AccountServiceImpl implements AccountService {
		AccountDao accountDao;
	public AccountServiceImpl() {
		 accountDao = new AccountDaoImpl();
	}
	
	
	@Override
	public AccountPojo accountCreate(AccountPojo accountPojo)throws SystemException {
		// TODO Auto-generated method stub
		
		return accountDao.accountCreate(accountPojo);
	}


	@Override
	public AccountPojo accountInfo(AccountPojo accountPojo)throws SystemException {
		// TODO Auto-generated method stub
		return accountDao.accountInfo(accountPojo);
	}


	@Override
	public AccountPojo accountLogin(AccountPojo accountPojo)throws SystemException {
		// TODO Auto-generated method stub
		return accountDao.accountLogin(accountPojo);
	}


}
