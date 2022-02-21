package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.AccountPojo;

public class AccountDaoImpl implements AccountDao {

	@Override
	public AccountPojo transfer(int AccountId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountPojo transcationHistory(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	

}
