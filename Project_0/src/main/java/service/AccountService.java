package service;

import pojo.AccountPojo;

public interface AccountService {
	
	AccountPojo accountCreate(AccountPojo accountPojo);
	
	AccountPojo accountInfo(int AccountId);
	
	AccountPojo transfer(int accountId);

	AccountPojo transcationHistory(AccountPojo accountPojo);

}
