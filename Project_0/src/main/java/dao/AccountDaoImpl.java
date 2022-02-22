package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.SystemException;
import pojo.AccountPojo;
import pojo.TransactionPojo;


public class AccountDaoImpl implements AccountDao {

	
	public static final Logger LOG = LogManager.getLogger(AccountDaoImpl.class);

	@Override
	public AccountPojo accountCreate(AccountPojo accountPojo)throws SystemException {
		// TODO Auto-generated method stub
		LOG.info("Entered accountCreate() in Account DAO");
		Connection conn = DBUtil.getConnected();
		
		try {
			
			Statement st = conn.createStatement();
			
			// creating new customerId that belongs to customer_details table
			ResultSet rs = st.executeQuery("SELECT MAX(customer_id) AS last_Id FROM customer_details");
			if (rs.next()) {
				int rows = rs.getInt("last_Id");
			
			accountPojo.setAccountCustomerId(rows);
			}
			// creating first account for customer
			String query = "INSERT INTO account_details(customer_id, account_name) VALUES("
					+ accountPojo.getAccountCustomerId()  + ",'" + accountPojo.getAccountName()+ "')";
			int rows2 = st.executeUpdate(query);
			
			
			// Creating second account for customer
			String query2 = "INSERT INTO account_details(customer_id, account_name) VALUES("
					+ accountPojo.getAccountCustomerId()  + ",'" + accountPojo.getAccountName2() + "')";
			int rows5 = st.executeUpdate(query2);
			
			
			// Transferring starting balance
			String query3 = "UPDATE account_details SET account_balance=" + accountPojo.getAccountBalance()
					+ "WHERE account_name='" + accountPojo.getAccountName() + "' AND customer_id="
					+ accountPojo.getAccountCustomerId();
			int rows6 = st.executeUpdate(query3);
			
			
			// Setting accounts username and password
			String queryuser = "UPDATE account_details SET username='" + accountPojo.getAccountUsername()
			+ "' WHERE customer_id="+ accountPojo.getAccountCustomerId();
			int rows3 = st.executeUpdate(queryuser);
			String queryPass = "UPDATE account_details SET password='" + accountPojo.getAccountPassword()
			+ "' WHERE customer_id="+ accountPojo.getAccountCustomerId();
			int rowP = st.executeUpdate(queryPass);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SystemException();
		}
		LOG.info("Exited accountCreate() in Account DAO");
		return null;
	}

	@Override
	public AccountPojo accountInfo(AccountPojo accountPojo)throws SystemException{
		// TODO Auto-generated method stub
		LOG.info("Entered accountinfo() in Account DAO");
		Connection conn = DBUtil.getConnected();
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT customer_id FROM account_details WHERE username='"+ accountPojo.getAccountUsername()
			+ "'AND password='"+accountPojo.getAccountPassword()+"'");
			if(rs.next()) {
				int newID = rs.getInt(1);
				accountPojo.setAccountCustomerId(newID);
				
				
			}
			String query = "SELECT MAX(account_id) FROM account_details  WHERE customer_id=" + accountPojo.getAccountCustomerId();
			ResultSet rr = st.executeQuery(query);
			if (rr.next()) {
				int firstAccount = rr.getInt(1);
				String acc1 = "SELECT account_name, account_balance FROM account_details WHERE account_id ="+firstAccount;
				ResultSet rr2 =st.executeQuery(acc1);
				if(rr2.next()) {
					String name =rr2.getString(1);
					accountPojo.setAccountName(name);
					int bal = rr2.getInt(2);
					accountPojo.setAccountBalance(bal);
				
				}
			}
			String query2 = "SELECT MIN(account_id) FROM account_details  WHERE customer_id=" + accountPojo.getAccountCustomerId();
			ResultSet res = st.executeQuery(query2);
			if (res.next()) {
				int secAccount = res.getInt(1);
				ResultSet res2 =st.executeQuery("SELECT account_name, account_balance FROM account_details WHERE account_id ="+secAccount);
				if(res2.next()) {
					String name =res2.getString(1);
					accountPojo.setAccountName2(name);
					int bal = res2.getInt(2);
					accountPojo.setAccountBalance2(bal);			
				}
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SystemException();
		}
		LOG.info("Exited accountinfo() in Account DAO");
		return null;
	}

	@Override
	public AccountPojo accountLogin(AccountPojo accountPojo)throws SystemException {
		// TODO Auto-generated method stub
		LOG.info("Entered accountlogin() in Account DAO");
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
			String query = "SELECT * FROM account_details WHERE username= '" + accountPojo.getAccountUsername()
					+ "'AND password='" + accountPojo.getAccountPassword() + "'";
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				accountPojo.setCheck(true);
			} else {
				accountPojo.setCheck(false);
			}

		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			//throw new SystemException();
		}
		LOG.info("Exited accountlogin() in Account DAO");
		return null;
	}	

}
