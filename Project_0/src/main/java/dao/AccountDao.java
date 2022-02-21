package dao;

import pojo.AccountPojo;

public interface AccountDao {
	
	AccountPojo transfer(int AccountId);
	
	AccountPojo transcationHistory(AccountPojo accountPojo );
	
}
