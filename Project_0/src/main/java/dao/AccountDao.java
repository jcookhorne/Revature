package dao;

import exceptions.SystemException;
import pojo.AccountPojo;

public interface AccountDao {
	
	AccountPojo accountCreate(AccountPojo accountPojo) throws SystemException;
	
	AccountPojo accountInfo(AccountPojo accountpojo)throws SystemException;
	
	AccountPojo accountLogin(AccountPojo accountPojo)throws SystemException;
	
	
}
