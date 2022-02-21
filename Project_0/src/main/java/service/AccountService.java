package service;

import pojo.AccountPojo;

public interface AccountService {
	
	AccountPojo accountCreate(AccountPojo accountPojo);
	
	AccountPojo accountInfo(AccountPojo accountPojo);
	
	
	AccountPojo accountLogin(AccountPojo accountPojo);

}
