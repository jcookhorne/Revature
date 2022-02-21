package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.AccountPojo;
import pojo.TransactionPojo;

public class TransactionDaoImpl implements TransactionDao {

	@Override
	public TransactionPojo transfer(TransactionPojo transactionPojo) {
		// TODO Auto-generated method stub
		AccountPojo account = new AccountPojo();
		Connection conn = DBUtil.getConnected();		
			try {
				Statement st = conn.createStatement();
				System.out.println(account.getAccountUsername());
				ResultSet rs = st.executeQuery("SELECT customer_id FROM account_details WHERE username='"+ account.getAccountUsername()
				+ "'AND password='"+account.getAccountPassword()+"'");
				if(rs.next()) {
					int newID = rs.getInt(1);
					account.setAccountCustomerId(newID);
				}
				System.out.println(account.getAccountCustomerId());
				//String query = "SELECT account_id FROM account_details WHERE customer_id="  ;
				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public List<TransactionPojo> transactionHistory() {
		// TODO Auto-generated method stubConnection conn = DBUtil.getConnected();
		Connection conn = DBUtil.getConnected();
		List<TransactionPojo> history = new ArrayList<TransactionPojo>();
		try {
			Statement st = conn.createStatement();
			String query = "";
			
			String query2 ="SELECT * FROM transaction_details";
			ResultSet rs =st.executeQuery(query2);
			while(rs.next()) {
				TransactionPojo allInfo = new TransactionPojo(rs.getInt(1),
						rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
				history.add(allInfo);
			}
			
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return null;
}



}
