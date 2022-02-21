package service;

import java.util.List;

import pojo.TransactionPojo;

public interface TransactionService {

	TransactionPojo transfer(TransactionPojo transactionPojo);
	
	
	List<TransactionPojo> transactionHistory();

}
