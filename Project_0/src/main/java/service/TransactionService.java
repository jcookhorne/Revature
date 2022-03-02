package service;

import java.util.List;

import exceptions.InsufficientFunds;
import exceptions.SystemException;
import pojo.TransactionPojo;

public interface TransactionService {

	TransactionPojo transfer(TransactionPojo transactionPojo)throws SystemException;
	
	
	List<TransactionPojo> transactionHistory(TransactionPojo transactionPojo)throws SystemException;

}
