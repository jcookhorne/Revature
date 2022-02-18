package service;

import pojo.AccountPojo;

public interface AccountService {
	AccountPojo transfer(String AccountName);

	AccountPojo transcationHistory(AccountPojo accountPojo);

}
