package dao;

import java.util.List;

import pojo.TransactionPojo;

public interface TransactionDao {
	
	TransactionPojo transfer(TransactionPojo transactionPojo);
	
	List<TransactionPojo> transactionHistory();

}
