package service;

import java.util.List;

import dao.TransactionDao;
import dao.TransactionDaoImpl;
import pojo.TransactionPojo;

public class TransactionServiceImpl implements TransactionService {

	TransactionDao transactionDao;
	
	public TransactionServiceImpl() {
		transactionDao = new TransactionDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public TransactionPojo transfer(TransactionPojo transactionPojo) {
		// TODO Auto-generated method stub
		return transactionDao.transfer(transactionPojo);
	}

	@Override
	public List<TransactionPojo> transactionHistory() {
		// TODO Auto-generated method stub
		return transactionDao.transactionHistory();
	}

	


}
