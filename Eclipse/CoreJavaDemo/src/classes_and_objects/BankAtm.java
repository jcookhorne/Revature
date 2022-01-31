package classes_and_objects;

import java.util.Scanner;

public class BankAtm {
	String username;
	String password;
	double balance;
	String response;
	
	
	
	
	// create account
	String CreateAccount(String user, String pass)
	{
		return "Your account name is : " + user + " and the password : " + pass;
	}
	
	
	// will print back current balance no update
	Double Balance(double currentBalance) {
		System.out.println("your current balance");
		return currentBalance;
	}
	
	
	
	// will update balance 
	
	Double Withdraw(double amt) {
		double withdrawA;
		double newBalance;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much would you like to withdraw");
		withdrawA = sc.nextDouble();
		sc.close();
		newBalance = amt - withdrawA;
		balance = newBalance;
		System.out.println("Your current Balance is : ");
		return newBalance;
	}
	

	Double BalanceChoice(String answer) {
		if (answer.contentEquals("yes")) {
			return Balance(balance);
		}else {
			return null;
			
		}
	}
	Double WithdrawChoice(String answer) {
		if (answer.contentEquals("yes")) {
			return Withdraw(balance);
		}else {
			return  null;
			
		}
	}
	
	
	
	
}
