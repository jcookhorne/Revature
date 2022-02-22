package service;

import exceptions.SystemException;
import pojo.AccountPojo;

public interface AccountService {
	
	AccountPojo accountCreate(AccountPojo accountPojo)throws SystemException;
	
	AccountPojo accountInfo(AccountPojo accountPojo)throws SystemException;
	
	
	AccountPojo accountLogin(AccountPojo accountPojo)throws SystemException;

}
