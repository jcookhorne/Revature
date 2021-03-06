package service;

import java.util.List;

import dao.TransactionDao;
import dao.TransactionDaoImpl;
import exceptions.InsufficientFunds;
import exceptions.SystemException;
import pojo.TransactionPojo;

public class TransactionServiceImpl implements TransactionService {

	TransactionDao transactionDao;
	
	public TransactionServiceImpl() {
		transactionDao = new TransactionDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public TransactionPojo transfer(TransactionPojo transactionPojo)throws SystemException{
		// TODO Auto-generated method stub
		return transactionDao.transfer(transactionPojo);
	}

	@Override
	public List<TransactionPojo> transactionHistory(TransactionPojo transactionPojo)throws SystemException {
		// TODO Auto-generated method stub
		return transactionDao.transactionHistory(transactionPojo);
	}

	


}
