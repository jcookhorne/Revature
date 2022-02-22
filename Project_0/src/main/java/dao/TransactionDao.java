package dao;

import java.util.List;

import exceptions.SystemException;
import pojo.TransactionPojo;

public interface TransactionDao {
	
	TransactionPojo transfer(TransactionPojo transactionPojo)throws SystemException;
	
	List<TransactionPojo> transactionHistory()throws SystemException;

}
