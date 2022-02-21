package dao;

import pojo.AccountPojo;

public interface AccountDao {
	
	AccountPojo accountCreate(AccountPojo accountPojo);
	
	AccountPojo accountInfo(int AccountId);
	
	AccountPojo transfer(int AccountId);
	
	AccountPojo transcationHistory(AccountPojo accountPojo );
	
}
