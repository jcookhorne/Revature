package dao;

import pojo.AccountPojo;

public interface AccountDao {
	
	AccountPojo accountCreate(AccountPojo accountPojo);
	
	AccountPojo accountInfo(AccountPojo accountpojo);
	
	AccountPojo accountLogin(AccountPojo accountPojo);
	
}
