package dao;

import pojo.AccountPojo;

public interface AccountDao {
	
	AccountPojo transfer(String AccountName);
	
	AccountPojo transcationHistory(AccountPojo accountPojo );
	
}
