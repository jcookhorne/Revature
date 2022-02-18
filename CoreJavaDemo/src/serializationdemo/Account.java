package serializationdemo;

import java.io.Serializable;

public class Account implements Serializable {
	
	private int accNum;
	private String accName;
	transient private int atmAmt;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNum, String accName, int atmAmt) {
		super();
		this.accNum = accNum;
		this.accName = accName;
		this.atmAmt = atmAmt;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccAmt() {
		return atmAmt;
	}
	public void setAccAmt(int accAmt) {
		this.atmAmt = accAmt;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", atmAmt=" + atmAmt + "]";
	}
	
	
	
}
