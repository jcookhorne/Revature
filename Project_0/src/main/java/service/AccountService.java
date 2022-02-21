package service;

import pojo.AccountPojo;

public interface AccountService {
	AccountPojo transfer(int accountId);

	AccountPojo transcationHistory(AccountPojo accountPojo);

}
