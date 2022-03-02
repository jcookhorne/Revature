package dao;

import java.util.List;

import exceptions.InsufficientFunds;
import exceptions.SystemException;
import pojo.TransactionPojo;

public interface TransactionDao {
	
	TransactionPojo transfer(TransactionPojo transactionPojo)throws SystemException;
	
	List<TransactionPojo> transactionHistory(TransactionPojo transactionPojo)throws SystemException;

}
