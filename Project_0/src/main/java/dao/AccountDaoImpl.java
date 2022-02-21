package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.AccountPojo;
import pojo.CustomerPojo;

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

	@Override
	public AccountPojo accountCreate(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();
		CustomerPojo customerPojo = new CustomerPojo();
		try {
			
			Statement st = conn.createStatement();
			
			// creating new customerId that belongs to customer_details table
			ResultSet rs = st.executeQuery("SELECT MAX(customer_id) AS last_Id FROM customer_details");
			if (rs.next()) {
				int rows = rs.getInt("last_Id");
			
			customerPojo.setCustomerId(rows);
			}
			// creating first account for customer
			String query = "INSERT INTO account_details(customer_id, account_name) VALUES("
					+ customerPojo.getCustomerId()  + ",'" + accountPojo.getAccountName()+ "')";
			int rows2 = st.executeUpdate(query);
			
			
			// Creating second account for customer
			String query2 = "INSERT INTO account_details(customer_id, account_name) VALUES("
					+ customerPojo.getCustomerId()  + ",'" + accountPojo.getAccountName2() + "')";
			int rows5 = st.executeUpdate(query2);
			
			
			// Transferring starting balance
			String query3 = "UPDATE account_details SET account_balance=" + accountPojo.getAccountBalance()
					+ "WHERE account_name='" + accountPojo.getAccountName() + "' AND customer_id="
					+ customerPojo.getCustomerId();
			int rows6 = st.executeUpdate(query3);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public AccountPojo accountInfo(int AccountId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();
			String query = "SELECT account_name, account_balance FROM account_details ";
		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	

}
