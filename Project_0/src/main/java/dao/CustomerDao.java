package dao;

import exceptions.SystemException;
import pojo.CustomerPojo;

public interface CustomerDao {
	// read account info ( balance of accounts)

	CustomerPojo creatingAccount(CustomerPojo customerPojo)throws SystemException;
	
	
	default void exitApplication() throws SystemException{
		DBUtil.closeConnection();
	}
}
